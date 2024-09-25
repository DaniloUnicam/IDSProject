package it.cs.unicam.app_Comune.Controller;

import it.cs.unicam.app_Comune.Model.ContestOutputFormat;
import it.cs.unicam.app_Comune.Repository.RepositoryContest;
import it.cs.unicam.app_Comune.Repository.RepositoryUtente;

//TODO
public class ControllerContest {

    private RepositoryContest repositoryContest;
    private RepositoryUtente repositoryUtente;

//collegamento con repository contest  e repository utente
public ContestOutputFormat ottieniUnContest(Long idContest) {
       // return repositoryContest.ottieniContest(idContest).getOutputFormat();
    return null;
}


    //public boolean aggiuntaIscrizione(String idUtente, String idContest) { //repository contest e repository utente
    //    return repositoryContest.findById(idContest).get();
    //}


    public boolean chiedeCreazioneContest(){ //permesso di creare un contest CON HANDLER AUTORIZZAZIONE
        return false;

    }


    //restituiamo ID


    public String creaContest(){ //questo non sono sicura che restituisce String CON bUILDER CONTEST E REPOSITORY CONTEST
    //TODO parametro contest
        return null;
    }
}
