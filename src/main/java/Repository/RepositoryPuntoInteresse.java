package Repository;

import Model.PuntoInteresse;
import java.util.HashMap;

public class RepositoryPuntoInteresse extends GenericRepository<PuntoInteresse> {

    private static RepositoryPuntoInteresse instance;

    private RepositoryPuntoInteresse() {
        super(new HashMap<String,PuntoInteresse>());
    }

    public static RepositoryPuntoInteresse getInstance() {
        if (instance == null) {
            instance = new RepositoryPuntoInteresse();
        }
        return instance;
    }


}
