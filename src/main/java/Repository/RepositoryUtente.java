package Repository;

import Model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface RepositoryUtente extends JpaRepository<Utente,String> {


}