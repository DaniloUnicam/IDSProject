package Repository;

import Model.Utente;

import java.util.HashMap;

public class RepositoryUtente extends GenericRepository<Utente> {

    private static RepositoryUtente instance;

    private RepositoryUtente() {
        super(new HashMap<String, Utente>());
    }

    public static RepositoryUtente getInstance() {
        if (instance == null) {
            instance = new RepositoryUtente();
        }
        return instance;
    }


}