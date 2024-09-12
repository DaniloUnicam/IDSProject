package Repository;

import Model.Utente;

import java.util.HashMap;
import java.util.List;

public class RepositoryUtente extends GenericRepository<Utente> {

    private static RepositoryUtente repositoryUtente;

    private RepositoryUtente() {
        super(new HashMap<String, Utente>());
    }

    public static RepositoryUtente getInstance() {
        if (repositoryUtente == null) {
            repositoryUtente = new RepositoryUtente();
        }
        return repositoryUtente;
    }

    public Utente ottieniUtente(String idUtente){
        return super.get(idUtente.toString());
    }

    public List<Utente> ottieniUtenti(){
        return super.getAll();
    }

}