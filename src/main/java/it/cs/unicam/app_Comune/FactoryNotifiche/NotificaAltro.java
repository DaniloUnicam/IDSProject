package it.cs.unicam.app_Comune.FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

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
