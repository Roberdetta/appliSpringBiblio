package tp.appliSpring.core.entity;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class Adresse {
	
	private Long num;
	private String rue;
	private Long codePostal;
	private String ville;
	private String pays;
}
