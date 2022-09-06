package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorColumn(name="abonnés")
@Getter @Setter
public class Abonne extends Personne {
	
	private Timestamp dateDebutAbonnement;
	private Timestamp dateFinAbonnement;
	
	public void changePassword() {
		
	}
}
