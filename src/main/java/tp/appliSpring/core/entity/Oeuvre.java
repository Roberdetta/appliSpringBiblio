package tp.appliSpring.core.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Oeuvre {
	
	@Id
	private String isbn;
	private String titre;
	private String auteur;
	private String editeur;

	@OneToMany(mappedBy = "oeuvre")
	private List<Exemplaire> exemplaires;
}
