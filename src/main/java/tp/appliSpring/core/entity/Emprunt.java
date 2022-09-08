package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp dateDebut;
	private Timestamp dateFin;
	
	@OneToOne(optional = true)
	private Contentieux contentieux;
	
	@ManyToOne(optional = false)
	private Abonne Emprunteur;
	
	@ManyToOne(optional = false)
	private Exemplaire exemplaire;
	
}
