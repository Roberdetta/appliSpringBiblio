package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorColumn(name="abonnes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Abonne extends Personne {
	
	private Timestamp dateDebutAbonnement;
	private Timestamp dateFinAbonnement;
	
	public void changePassword() {
		
	}
}
