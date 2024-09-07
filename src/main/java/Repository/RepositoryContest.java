package Repository;

import Model.Contest;

import java.util.HashMap;
import java.util.Optional;

public class RepositoryContest extends GenericRepository<Contest> {

    private static RepositoryContest repositoryContest;

    private RepositoryContest() {
        super(new HashMap<String, Contest>());
    }

    public static RepositoryContest getInstance() {
        if (repositoryContest == null) {
            repositoryContest = new RepositoryContest();
        }
        return repositoryContest;
    }
    //CONTROLLO
    public Contest ottieniContest(String idContest){
    for(Contest contest : super.getAll()) {
        if(contest.getID().equals(idContest)) {
            return contest;
        }
    }

    public void contestCreato(){
        //inserisci un contest dentro alla repository
    }

}
