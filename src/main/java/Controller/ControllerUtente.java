package Controller;

import Autorizzazioni.Autorizzazione;
import Autorizzazioni.ModificaRuoloUtente;
import Autorizzazioni.Ruolo;
import Model.Utente;

import static Repository.RepositoryUtente.repositoryUtente;

//TODO
public class ControllerUtente {

    public boolean modificaInformazioneUtente(Utente idUtente, String campo, String testo){
        ModificaRuoloUtente modificaRuoloUtente = new ModificaRuoloUtente();
        modificaRuoloUtente.verificaRuolo(idUtente, idUtente.getRuolo());
        modificaRuoloUtente.modificaInformazioneUtente(idUtente, campo, testo);
        return true;
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
    //TODO
    public Utente ottieniUtente(Utente idUtente){
        return repositoryUtente.ottieniUtente(idUtente.getIdUtente());
    }




}
