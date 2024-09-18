package Controller;

import Model.Contest;
import Repository.RepositoryContest;

import java.util.Optional;
//TODO
public class ControllerContest {


    private RepositoryContest repositoryContest;

//collegamento con repository contest  e repository utente
    public ContestOf ottieniUnContest(String idContest) {
    }


    //COME FACCIO AD AGGIUNGERE UN CONTEST E DARE TRUE?

    public boolean aggiuntaIscrizione(String idUtente, String idContest){ //repository contest e repository utente
        if(repositoryContest.ottieniContest(idContest).aggiungiIscrizione(idUtente)){
            return true;
        }else{
            return false;
        }
    }


    public boolean chiedeCreazioneContest(){ //permesso di creare un contest CON HANDLER AUTORIZZAZIONE
        return false;

    }


    //restituiamo ID
    public String creaContest(Contest contest){ //questo non sono sicura che restituisce String CON bUILDER CONTEST E REPOSITORY CONTEST
        return repositoryContest.aggiungiContest(contest).getId();
    }
}
