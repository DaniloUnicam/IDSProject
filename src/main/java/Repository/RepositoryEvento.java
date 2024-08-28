package Repository;

import Model.Evento;

import java.util.HashMap;

public class RepositoryEvento extends GenericRepository<Evento> {

    private static RepositoryEvento instance;

    private RepositoryEvento() {
        super(new HashMap<String, Evento>());
    }

    public static RepositoryEvento getInstance() {
        if (instance == null) {
            instance = new RepositoryEvento();
        }
        return instance;
    }

    public Evento[] richiesta(){
        return null;
        //TODO
    }
}
