package tp.appliSpring.core.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Oeuvre {
	
	private String titre;
	private String auteur;
	private String editeur;
	
	@Id
	private String idPublication;
	
	@OneToMany (mappedBy = "oeuvre")
	private List<Exemplaire> exemplaireList;
	
}
