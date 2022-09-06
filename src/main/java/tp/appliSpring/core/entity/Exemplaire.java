package tp.appliSpring.core.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import tp.appliSpring.core.enumeration.EtatExemplaire;
import tp.appliSpring.core.enumeration.UsageExemplaire;

@Entity
@Getter @Setter
public class Exemplaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;
	
	@Enumerated
	private EtatExemplaire etatPhysique;
	
	@Enumerated
	private UsageExemplaire usage;
	
	@ManyToOne (optional = false)
	private Oeuvre oeuvre;
}
