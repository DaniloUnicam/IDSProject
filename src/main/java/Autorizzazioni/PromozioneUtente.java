package Autorizzazioni;

import Model.Utente;
/**
 * Classe che rappresenta la promozione di un utente
 */
public class PromozioneUtente {

    public void promuoviUtente(Utente utente, Ruolo ruolo){
        utente.setRuolo(ruolo);
    }

    public void degradaUtente(Utente utente, Ruolo ruolo){
        if(utente.getRuolo().ordinal() > ruolo.ordinal()){
            utente.setRuolo(ruolo);
        }
    }
}
