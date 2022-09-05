package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp dateDebut;
	private Timestamp dateFin;
	
	@OneToOne (optional = true)
	private Contentieux contentieux;
	
	@ManyToOne
	private Abonne Emprunteur;
	
	@ManyToOne
	private Exemplaire exemplaire;
	
}
