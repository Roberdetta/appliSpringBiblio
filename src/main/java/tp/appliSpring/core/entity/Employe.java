package tp.appliSpring.core.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorColumn(name="employés")
@Getter @Setter
public class Employe extends Personne {

	private String role;
}
