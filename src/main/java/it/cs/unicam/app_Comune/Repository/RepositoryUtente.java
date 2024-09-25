package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.Model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUtente extends JpaRepository<Utente,Long> {


}