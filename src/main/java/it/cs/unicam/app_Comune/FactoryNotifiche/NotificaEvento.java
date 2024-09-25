package it.cs.unicam.app_Comune.FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("NOTIFICA_EVENTO")

public class NotificaEvento extends Notifica {

    public NotificaEvento() {
        super();
        setPriorita(3);
        setTipoNotifica(TipoNotifica.NOTIFICA_EVENTO);
    }

}
