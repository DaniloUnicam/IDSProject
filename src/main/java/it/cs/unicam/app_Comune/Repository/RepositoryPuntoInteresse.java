package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryPuntoInteresse extends JpaRepository<PuntoInteresse,Long> { }