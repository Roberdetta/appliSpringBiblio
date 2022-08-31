package tp.appliSpring.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Oeuvre {
	
	@Id
	private String idPublication;
	
	private String titre;
	private String auteur;
	private String editeur;
	
}
