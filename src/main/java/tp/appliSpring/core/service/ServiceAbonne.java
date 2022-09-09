package tp.appliSpring.core.service;

import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Personne;

public interface ServiceAbonne {
	Abonne rechercherAbonne(Long id);
	void sauvegarderAbonne(Abonne abonne);
	Boolean verifierValidateAbonnement();
}
