package Repository;

import Model.Utente;

import java.util.HashMap;

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


}