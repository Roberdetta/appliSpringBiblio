package tp.appliSpring.core.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorColumn(name="abonnes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Abonne extends Personne {
	
	private LocalDateTime dateDebutAbonnement;
	private LocalDateTime dateFinAbonnement;
	
	public void changePassword() {
		
	}
}
