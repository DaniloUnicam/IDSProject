package Repository;

import InformazioneTerritoriale.PuntoInteresse;
import Model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface RepositoryUtente extends JpaRepository<PuntoInteresse,String> {


}