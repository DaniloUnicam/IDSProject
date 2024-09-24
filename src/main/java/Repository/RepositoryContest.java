package Repository;

import InformazioneTerritoriale.PuntoInteresse;
import Model.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;
@Repository
public interface RepositoryContest extends JpaRepository<Contest,String> {

}
