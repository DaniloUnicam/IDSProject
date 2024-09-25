package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.Model.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContest extends JpaRepository<Contest,Long> {

}
