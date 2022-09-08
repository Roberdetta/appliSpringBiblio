package tp.appliSpring.core.entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_personne")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	private String email;
	private String password;
	private LocalDate dateNaissance;
	
//	public Personne getTypePersonne() {
//		return null;
//	}
}