package FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("NOTIFICA_PUNTO_INTERESSE")

public class NotificaPuntoInteresse extends Notifica {

    public NotificaPuntoInteresse() {
        super();
        setPriorita(3);
        setTipoNotifica(TipoNotifica.NOTIFICA_PUNTO_INTERESSE);
    }

}
