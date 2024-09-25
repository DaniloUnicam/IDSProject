package it.cs.unicam.app_Comune.Repository;



import it.cs.unicam.app_Comune.InformazioneTerritoriale.InformazioneTerritoriale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryInformazioni extends JpaRepository<InformazioneTerritoriale, Long> {
/*
    @Autowired
    RepositoryEvento eventi;

    @Autowired
    RepositoryPuntoInteresse poi;

    @Autowired
    RepositoryItinerario itinerari;

    @Autowired
    RepositoryInformazioni repositoryInformazioni;

    default List<? extends it.cs.unicam.app_Comune.InformazioneTerritoriale> getAll (TipoInformazioneTerritoriale tipologia){

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

    default it.cs.unicam.app_Comune.InformazioneTerritoriale ottieneInformazione (String idInfo){
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