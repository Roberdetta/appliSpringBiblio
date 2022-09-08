package tp.appliSpring.core.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {
	
	private Long num;
	private String rue;
	private Long codePostal;
	private String ville;
	private String pays;
}
