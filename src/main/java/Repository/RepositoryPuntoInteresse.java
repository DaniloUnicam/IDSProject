package Repository;

import InformazioneTerritoriale.PuntoInteresse;
import java.util.HashMap;

public class RepositoryPuntoInteresse extends GenericRepository<PuntoInteresse> {

    private static RepositoryPuntoInteresse repositoryPuntoInteresse;

    private RepositoryPuntoInteresse() {
        super(new HashMap<String,PuntoInteresse>());
    }

    public static RepositoryPuntoInteresse getInstance() {
        if (repositoryPuntoInteresse == null) {
            repositoryPuntoInteresse = new RepositoryPuntoInteresse();
        }
        return repositoryPuntoInteresse;
    }




}
