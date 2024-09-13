package Repository;



import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.List;

public class RepositoryInformazioni {

    private RepositoryEvento eventi;
    private RepositoryPuntoInteresse poi;
    private RepositoryItinerario itinerari;
    private static RepositoryInformazioni repositoryInformazioni;

    private RepositoryInformazioni() {    }

    public static RepositoryInformazioni getInstance() {
        if (repositoryInformazioni == null) {
            repositoryInformazioni = new RepositoryInformazioni();
        }
        return repositoryInformazioni;
    }

    public List<? extends InformazioneTerritoriale> getAll (TipoInformazioneTerritoriale tipologia){
        switch (tipologia) {
            case EVENTO:
                return eventi.getAll();
            case POI:
                return poi.getAll();
            case ITINERARIO:
                return itinerari.getAll();
            default:
                return null;
        }
    }

    public InformazioneTerritoriale ottieneInformazione (String idInfo){
        if(eventi.ottieni(idInfo) != null){
            return eventi.ottieni(idInfo);
        }
        if(poi.ottieni(idInfo) != null){
            return poi.ottieni(idInfo);
        }
        if(itinerari.ottieni(idInfo) != null){
            return itinerari.ottieni(idInfo);
        }
           return null;
    }
}