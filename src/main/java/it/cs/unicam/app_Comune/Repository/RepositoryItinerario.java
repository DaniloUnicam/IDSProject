package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryItinerario extends JpaRepository<Itinerario,Long> {


}
