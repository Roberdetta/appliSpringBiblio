package tp.appliSpring.core.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorColumn(name="employés")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe extends Personne {

	private String role;
}
