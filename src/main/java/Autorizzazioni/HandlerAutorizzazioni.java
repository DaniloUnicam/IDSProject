package Autorizzazioni;

public class HandlerAutorizzazioni {

    public boolean chiedeCreazioneContest(Autorizzazione autorizzazione){
        return autorizzazione.isRuolo(Ruolo.Animatore_Autorizzato);
    }

}
