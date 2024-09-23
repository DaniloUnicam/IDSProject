package FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("NOTIFICA_EVENTO")

public class NotificaEvento extends Notifica {

    public NotificaEvento() {
        super();
        setPriorita(3);
        setTipoNotifica(TipoNotifica.NOTIFICA_EVENTO);
    }

}
