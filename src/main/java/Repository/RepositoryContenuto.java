package Repository;

import Model.Contenuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface RepositoryContenuto extends JpaRepository<Contenuto, String> {}
