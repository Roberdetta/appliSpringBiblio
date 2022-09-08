package tp.appliSpring.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tp.appliSpring.core.enumeration.EtatExemplaire;
import tp.appliSpring.core.enumeration.UsageExemplaire;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exemplaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;
	
	@Enumerated(EnumType.STRING)
	private EtatExemplaire etatPhysique;
	
	@Enumerated(EnumType.STRING)
	private UsageExemplaire usageExemplaire; //usage est un mot réservé => Erreur de syntaxe près de 'usage varchar(255) etc.
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "oeuvre_id")
	private Oeuvre oeuvre;
}
