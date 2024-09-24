package Repository;



import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Repository
public interface RepositoryInformazioni extends JpaRepository<InformazioneTerritoriale, String> {
/*
    @Autowired
    RepositoryEvento eventi;

    @Autowired
    RepositoryPuntoInteresse poi;

    @Autowired
    RepositoryItinerario itinerari;

    @Autowired
    RepositoryInformazioni repositoryInformazioni;

    default List<? extends InformazioneTerritoriale> getAll (TipoInformazioneTerritoriale tipologia){

        switch (tipologia) {
            case EVENTO:
                return eventi.findAll();
            case POI:
                return poi.findAll();
            case ITINERARIO:
                return itinerari.findAll();
            default:
                return new ArrayList<>();
        }
    }

    default InformazioneTerritoriale ottieneInformazione (String idInfo){
        if(eventi.findById(idInfo) != null){
            return eventi.findById(idInfo).get();
        }
        if(poi.findById(idInfo).isPresent()){
            return poi.findById(idInfo).get();
        }
        if(itinerari.findById(idInfo) != null){
            return itinerari.findById(idInfo).get();
        }
           return null;
    }
*/
}