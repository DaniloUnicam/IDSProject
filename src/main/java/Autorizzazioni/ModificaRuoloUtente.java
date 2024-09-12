package Autorizzazioni;

import Model.Utente;
/**
 * Classe che rappresenta la promozione di un utente
 */
public class ModificaRuoloUtente {

    public void aggiungiPrivilegio(Utente utente, Ruolo ruolo){
        verificaRuolo(utente, utente.getRuolo());
        utente.setRuolo(ruolo);
    }

    public void rimuoviPrivilegio(Utente utente, Ruolo ruolo){
        verificaRuolo(utente, utente.getRuolo());
        if(utente.getRuolo().ordinal() > ruolo.ordinal()){
            utente.setRuolo(ruolo);
        }
    }

    public boolean modificaInformazioneUtente(Utente idUtente, String campo, String testo){
        verificaRuolo(idUtente, idUtente.getRuolo());
        switch(campo.toLowerCase()) {
            case "nome":
                idUtente.setNome(testo);
                return true;
            case "cognome":
                idUtente.setCognome(testo);
                return true;
            case "email":
                idUtente.setEmail(testo);
                return true;
            case "password":
                idUtente.setPassword(testo);
                return true;
            default:
                return false;
        }
    }

    public void verificaRuolo(Utente idUtente, Ruolo ruolo){
        if(idUtente == null || ruolo == null){
            throw new IllegalArgumentException("Parametri non validi");
        }
    }
}
