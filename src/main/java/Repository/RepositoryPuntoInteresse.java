package Repository;

import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.PuntoInteresse;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;
import java.util.HashMap;
import java.util.List;
//TODO
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

    public List<InformazioneTerritoriale> richiesta(TipoInformazioneTerritoriale tipologia){
        

    }

    public InformazioneTerritoriale ottieniInformazione(String idInfo){

    }

}
