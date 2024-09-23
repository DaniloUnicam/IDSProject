package FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("NOTIFICA_EMERGENZA")
public class NotificaEmergenza extends Notifica {

    public NotificaEmergenza() {
        super();
        setPriorita(1.0f);
        setTipoNotifica(TipoNotifica.NOTIFICA_EMERGENZA);
    }


}
