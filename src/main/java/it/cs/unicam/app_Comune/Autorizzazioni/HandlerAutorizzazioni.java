package it.cs.unicam.app_Comune.Autorizzazioni;
/**
 * Classe che gestisce le autorizzazioni
 */
public class HandlerAutorizzazioni {

    public boolean chiedeCreazioneContest(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Animatore_Autorizzato) ;
    }

    public boolean chiedeCreazioneEvento(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Animatore_Autorizzato);
    }

    public boolean chiedeRimozioneContest(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Animatore_Autorizzato);
    }

    public boolean chiedeRimozioneEvento(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Animatore_Autorizzato);
    }

    public boolean chiedeCreazionePuntoInteresse(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Contributor_Autorizzato);
    }

    public boolean chiedeRimozionePuntoInteresse(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Responsabile_Territorio_Comunale);
    }

    public boolean chiedeCreazioneSegnalazione(Autorizzazione autorizzazione){
        return autorizzazione.haPermesso(Ruolo.Turista_Autenticato);
    }

}
