package tp.appliSpring.core.service;

public interface ServiceEmprunt {
	Long calculerNbExemplairesAutorisĂ©s (Long numAb);
	void getListeEmpruntEnCours (long numAb);
	void crudEmprunt();
}
