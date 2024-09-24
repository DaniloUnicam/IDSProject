package Repository;

import InformazioneTerritoriale.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public interface RepositoryItinerario extends JpaRepository<Itinerario,String> {


}
