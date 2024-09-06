package Repository;



import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.ArrayList;
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
        if(eventi.get(idInfo) != null){
            return eventi.get(idInfo);
        }
        if(poi.get(idInfo) != null){
            return poi.get(idInfo);
        }
        if(itinerari.get(idInfo) != null){
            return itinerari.get(idInfo);
        }
           return null;
    }


}
