package it.cs.unicam.app_Comune.Repository;

import it.cs.unicam.app_Comune.FactoryNotifiche.Notifica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryNotifiche extends JpaRepository<Notifica,Long> { }
