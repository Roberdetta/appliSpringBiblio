package tp.appliSpring.core.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.PersonneDao;
import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Personne;

@Service
@Transactional
public class ServiceAbonneImpl implements ServiceAbonne {

	@Autowired
	private PersonneDao abonneDao;
	
	@Override
	public Abonne rechercherAbonne(Long id) {
		Optional<Personne> optionalAbonne = abonneDao.findById(id);
		if(optionalAbonne.isPresent()) {
			return (Abonne) optionalAbonne.get();
		}else {
			//throw new NotFoundException("aucune devise existe avec le code="+code);
			throw new RuntimeException("aucune devise existe avec le code="+id);
			//avec @ResponseStatus(HttpStatus.NOT_FOUND) 
			//au dessus de class NotFoundException ..{}
		}
	}

	@Override
	public void sauvegarderAbonne(Abonne abonne) {
		''
	}

	@Override
	public Boolean verifierValidateAbonnement() {
		return null;
	}
	
}
