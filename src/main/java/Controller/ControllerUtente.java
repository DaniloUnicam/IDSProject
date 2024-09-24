package Controller;

import Autorizzazioni.ModificaRuoloUtente;
import Autorizzazioni.Ruolo;
import Model.Utente;
import Repository.RepositoryUtente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe che gestisce le operazioni sugli utenti
 */
@RestController
@RequestMapping("utente")
public class ControllerUtente {

    public boolean modificaInformazioneUtente(Utente idUtente, String campo, String testo){
        ModificaRuoloUtente modificaRuoloUtente = new ModificaRuoloUtente();
        modificaRuoloUtente.verificaRuolo(idUtente, idUtente.getRuolo());
        return modificaRuoloUtente.modificaInformazioneUtente(idUtente, campo, testo);
    }

    public void aggiungiPrivilegio(Utente idUtente, Ruolo ruolo){
        ModificaRuoloUtente aggiungiRuolo = new ModificaRuoloUtente();
        aggiungiRuolo.verificaRuolo(idUtente, idUtente.getRuolo());
        aggiungiRuolo.aggiungiPrivilegio(idUtente, ruolo);
    }

    public void rimuoviPrivilegio(Utente idUtente, Ruolo ruolo){
        ModificaRuoloUtente rimuoviRuolo = new ModificaRuoloUtente();
        rimuoviRuolo.verificaRuolo(idUtente, idUtente.getRuolo());
        rimuoviRuolo.rimuoviPrivilegio(idUtente, ruolo);
    }

/*
    public Utente ottieniUtente(String idUtente){
        RepositoryUtente repositoryUtente = new RepositoryUtente();
        return repositoryUtente.ottieni(idUtente);
    }

*/
}
