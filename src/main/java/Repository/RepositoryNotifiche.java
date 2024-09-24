package Repository;

import FactoryNotifiche.Notifica;
import InformazioneTerritoriale.PuntoInteresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface RepositoryNotifiche extends JpaRepository<Notifica,String> { }
