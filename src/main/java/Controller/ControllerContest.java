package Controller;

import Model.Contest;
import Model.ContestOutputFormat;
import Repository.RepositoryContest;
import Repository.RepositoryUtente;

import java.util.Optional;
//TODO
public class ControllerContest {

    private RepositoryContest repositoryContest;
    private RepositoryUtente repositoryUtente;

//collegamento con repository contest  e repository utente
public ContestOutputFormat ottieniUnContest(String idContest) {
       // return repositoryContest.ottieniContest(idContest).getOutputFormat();
    return null;
}


    public boolean aggiuntaIscrizione(String idUtente, String idContest) { //repository contest e repository utente
        return repositoryContest.ottieniContest(idContest).aggiuntaIscrizione(repositoryUtente.ottieni(idUtente));
    }


    public boolean chiedeCreazioneContest(){ //permesso di creare un contest CON HANDLER AUTORIZZAZIONE
        return false;

    }


    //restituiamo ID


    public String creaContest(){ //questo non sono sicura che restituisce String CON bUILDER CONTEST E REPOSITORY CONTEST
    //TODO parametro contest
        return null;
    }
}
