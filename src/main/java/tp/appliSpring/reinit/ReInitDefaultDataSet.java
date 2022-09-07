package tp.appliSpring.reinit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("reInit")
public class ReInitDefaultDataSet {
	
	
	@Autowired
//	private ServiceAbonne;

	
	@PostConstruct
	public void initDataSet() {
		
	}

}
