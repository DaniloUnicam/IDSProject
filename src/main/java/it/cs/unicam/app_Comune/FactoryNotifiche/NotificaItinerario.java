package it.cs.unicam.app_Comune.FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("NOTIFICA_ITINERARIO")

public class NotificaItinerario extends Notifica {

    public NotificaItinerario() {
        super();
        setPriorita(4);
        setTipoNotifica(TipoNotifica.NOTIFICA_ITINERARIO);
    }

}
