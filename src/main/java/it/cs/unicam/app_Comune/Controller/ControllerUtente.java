package it.cs.unicam.app_Comune.Controller;

import it.cs.unicam.app_Comune.Autorizzazioni.ModificaRuoloUtente;
import it.cs.unicam.app_Comune.Autorizzazioni.Ruolo;
import it.cs.unicam.app_Comune.Model.Utente;
import it.cs.unicam.app_Comune.Repository.RepositoryUtente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe che gestisce le operazioni sugli utenti
 */
@RestController
@RequestMapping("utente")
public class ControllerUtente {

    @Autowired
    RepositoryUtente repositoryUtente;

    public ControllerUtente() {
    }

    public boolean modificaInformazioneUtente(Long idUtente, String campo, String testo){
        ModificaRuoloUtente modificaRuoloUtente = new ModificaRuoloUtente();
        modificaRuoloUtente.verificaRuolo(ottieniUtente(idUtente), ottieniUtente(idUtente).getRuolo());
        return modificaRuoloUtente.modificaInformazioneUtente(ottieniUtente(idUtente), campo, testo);
    }

    @GetMapping("aggiungiPrivilegio/{idUtente}/{ruolo}")
    public void aggiungiPrivilegio(Utente idUtente, Ruolo ruolo){
        ModificaRuoloUtente aggiungiRuolo = new ModificaRuoloUtente();
        aggiungiRuolo.verificaRuolo(idUtente, idUtente.getRuolo());
        aggiungiRuolo.aggiungiPrivilegio(idUtente, ruolo);
    }

    @GetMapping("rimuoviPrivilegio/{idUtente}/{ruolo}")
    public void rimuoviPrivilegio(Long idUtente, Ruolo ruolo){
        ModificaRuoloUtente rimuoviRuolo = new ModificaRuoloUtente();
        rimuoviRuolo.verificaRuolo(ottieniUtente(idUtente), ottieniUtente(idUtente).getRuolo());
        rimuoviRuolo.rimuoviPrivilegio(ottieniUtente(idUtente), ruolo);
    }


    public Utente ottieniUtente(Long idUtente){
        return repositoryUtente.findById(idUtente).get();
    }

}
