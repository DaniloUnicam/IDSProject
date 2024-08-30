package Repository;

import Model.Contenuto;

import java.util.HashMap;

public class RepositoryContenuto extends GenericRepository<Contenuto> {

    private static RepositoryContenuto repositoryContenuto;

    private RepositoryContenuto() {
        super(new HashMap<String, Contenuto>());
    }

    public static RepositoryContenuto getInstance() {
        if (repositoryContenuto == null) {
            repositoryContenuto = new RepositoryContenuto();
        }
        return repositoryContenuto;
    }

}
