package Repository;



import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositoryInformazioni extends GenericRepository<InformazioneTerritoriale> {

    private RepositoryEvento eventi;
    private RepositoryPuntoInteresse poi;
    private RepositoryItinerario itinerari;
    private static RepositoryInformazioni repositoryInformazioni;

    private RepositoryInformazioni() {
        super(new HashMap<String, InformazioneTerritoriale>());
    }

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
                return poi.findAll();
            case ITINERARIO:
                return itinerari.getAll();
            default:
                return new ArrayList<>();
        }
    }

    public InformazioneTerritoriale ottieneInformazione (String idInfo){
        if(eventi.ottieni(idInfo) != null){
            return eventi.ottieni(idInfo);
        }
        if(poi.findById(idInfo).isPresent()){
            return poi.findById(idInfo).get();
        }
        if(itinerari.ottieni(idInfo) != null){
            return itinerari.ottieni(idInfo);
        }
           return null;
    }

}