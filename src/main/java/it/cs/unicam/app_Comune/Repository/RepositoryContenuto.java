package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.Model.Contenuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContenuto extends JpaRepository<Contenuto, Long> {}
