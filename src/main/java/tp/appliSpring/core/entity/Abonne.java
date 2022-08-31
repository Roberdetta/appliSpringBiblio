package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@DiscriminatorColumn(name="abonné")
public class Abonne extends Personne {
	
	private Timestamp dateDebutAbonnement;
	private Timestamp dateFinAbonnement;
	
	public void changePassword() {
		
	}
}
