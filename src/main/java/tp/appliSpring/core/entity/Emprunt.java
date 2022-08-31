package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Emprunt {
	
	@Id
	private Long id;
	
	private Timestamp dateDebut;
	private Timestamp dateFin;
	
	
}
