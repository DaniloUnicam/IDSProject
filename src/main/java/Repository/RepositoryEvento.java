package Repository;

import InformazioneTerritoriale.Evento;
import InformazioneTerritoriale.PuntoInteresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public interface RepositoryEvento extends JpaRepository<Evento,String> {


}
