package FactoryNotifiche;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("NOTIFICA_UTENTE")

public class NotificaUtente extends Notifica {

        public NotificaUtente() {
            super();
            setPriorita(1.1f);
        }
}
