package tp.appliSpring.core.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contentieux {

	@Id
	
	private Long id;
	private Timestamp date;
	private String motif;
	private Boolean regle;
}
