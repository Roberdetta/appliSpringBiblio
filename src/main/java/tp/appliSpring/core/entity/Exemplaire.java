package tp.appliSpring.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tp.appliSpring.core.enumeration.EtatExemplaire;
import tp.appliSpring.core.enumeration.UsageExemplaire;

@Entity
public class Exemplaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;
	private EtatExemplaire etatPhysique;
	private UsageExemplaire usage;
}
