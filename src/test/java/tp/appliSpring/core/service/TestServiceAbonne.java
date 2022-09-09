package tp.appliSpring.core.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Adresse;
import tp.appliSpring.core.entity.Personne;

@ExtendWith(SpringExtension.class) //si junit5/jupiter
@SpringBootTest
@ActiveProfiles({ "embeddedDB" , "dev" })
//@ActiveProfiles({ "remoteDB" , "dev" })
public class TestServiceAbonne {
	
	private static Logger logger = LoggerFactory.getLogger(TestServiceAbonne.class);
	
	@Autowired
	private ServiceAbonne ServiceAbonne; //à tester
	
	
	@Test
	public void testRechercherDeviseParNumero() {
		
		Adresse adresse = new Adresse(18L, "rue du gouverneur général éboué", 92130L, "Issy-les-Moulineaux", "France");
		Abonne abonne = Abonne.builder()
				.id(1L)
				.nom("SABY")
				.prenom("Vincent")
				.adresse(adresse)
				.email("visored92i@gmail.com")
				.password("cacahuete")
				.dateNaissance(LocalDate.of(2, 6, 1994))
				.dateDebutAbonnement(LocalDateTime.now())
				.dateFinAbonnement(LocalDateTime.now().plusDays(7L))
				.build();
		
		//new Abonne(1L, "SABY", "Vincent", adresse, "visored92i@gmail.com", "cacahuete", LocalDate.of(2, 6, 1994), LocalDate.now(), LocalDate.now());
		
		Personne lol = (Personne) abonne; //verifier le sens des casts
		
		ServiceAbonne.sauvegarderAbonne(abonne); //INSERT INTO
		
		Abonne abonneTrouve = this.ServiceAbonne.rechercherAbonne(id); //SELECT
		Assertions.assertEquals("SABY", abonneTrouve.getNom());
		Assertions.assertEquals("Vincent",abonneTrouve.getPrenom());
		logger.debug("abonneTrouve=" + abonneTrouve);
		
	}
	
	
}
