package tp.appliSpring.core.entity;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Embeddable
public class Adresse {
	
	@Id
	private Long num;
	
	@Id
	private String rue;
	
	@Id
	private Long codePostal;
	
	@Id
	private String ville;
	
	@Id
	private String pays;
}
