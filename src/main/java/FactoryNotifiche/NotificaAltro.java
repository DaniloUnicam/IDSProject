package FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("NOTIFICA_ALTRO")
public class NotificaAltro extends Notifica {

    public NotificaAltro() {
        super();
        setTesto("Notifica non specificata");
        this.setTipoNotifica(TipoNotifica.NOTIFICA_ALTRO);
        setPriorita(5);
    }

}
