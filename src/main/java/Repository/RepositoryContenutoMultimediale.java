package Repository;

import Model.ContenutoMultimediale;

import java.util.HashMap;

public class RepositoryContenutoMultimediale extends GenericRepository<ContenutoMultimediale> {

    private static RepositoryContenutoMultimediale instance;

    private RepositoryContenutoMultimediale() {
        super(new HashMap<String, ContenutoMultimediale>());
    }

    public static RepositoryContenutoMultimediale getInstance() {
        if (instance == null) {
            instance = new RepositoryContenutoMultimediale();
        }
        return instance;
    }

}
