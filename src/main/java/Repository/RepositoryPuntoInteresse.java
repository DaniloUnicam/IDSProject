package Repository;

import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.PuntoInteresse;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository

public interface RepositoryPuntoInteresse extends JpaRepository<PuntoInteresse,String> { }