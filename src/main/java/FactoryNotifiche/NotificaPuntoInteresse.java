package FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("NOTIFICA_PUNTO_INTERESSE")

public class NotificaPuntoInteresse extends Notifica {

    public NotificaPuntoInteresse() {
        super();
        setPriorita(3);
        setTipoNotifica(TipoNotifica.NOTIFICA_PUNTO_INTERESSE);
    }

}
