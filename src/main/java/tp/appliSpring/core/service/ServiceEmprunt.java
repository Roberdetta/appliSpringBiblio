package tp.appliSpring.core.service;

public interface ServiceEmprunt {
	Long calculerNbExemplairesAutorisés (Long numAb);
	void getListeEmpruntEnCours (long numAb);
	void crudEmprunt();
}
