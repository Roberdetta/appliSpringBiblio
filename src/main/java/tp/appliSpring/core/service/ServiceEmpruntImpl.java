package tp.appliSpring.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceEmpruntImpl implements ServiceEmprunt {
	
	@Override
	public Long calculerNbExemplairesAutorisĂ©s (Long numAb) {
		Long nbExemplairesAutorisĂ©s = null;
		return nbExemplairesAutorisĂ©s;
	}

	@Override
	public void getListeEmpruntEnCours(long numAb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crudEmprunt() {
		// TODO Auto-generated method stub
		
	}
	
}
