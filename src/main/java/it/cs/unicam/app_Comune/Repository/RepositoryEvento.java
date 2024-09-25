package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEvento extends JpaRepository<Evento,Long> {


}
