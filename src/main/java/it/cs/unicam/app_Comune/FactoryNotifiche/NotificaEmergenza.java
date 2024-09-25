package it.cs.unicam.app_Comune.FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("NOTIFICA_EMERGENZA")
public class NotificaEmergenza extends Notifica {

    public NotificaEmergenza() {
        super();
        setPriorita(1.0f);
        setTipoNotifica(TipoNotifica.NOTIFICA_EMERGENZA);
    }


}
