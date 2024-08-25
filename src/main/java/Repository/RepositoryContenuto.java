package Repository;

import Model.Contenuto;

import java.util.HashMap;

public class RepositoryContenuto extends GenericRepository<Contenuto> {

    private static RepositoryContenuto instance;

    private RepositoryContenuto() {
        super(new HashMap<String, Contenuto>());
    }

    public static RepositoryContenuto getInstance() {
        if (instance == null) {
            instance = new RepositoryContenuto();
        }
        return instance;
    }

}
