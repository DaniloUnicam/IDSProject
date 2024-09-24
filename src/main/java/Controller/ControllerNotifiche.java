package Controller;

import FactoryNotifiche.FactoryTipologieNotifiche;
import FactoryNotifiche.Notifica;
import FactoryNotifiche.TipoNotifica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ControllerNotifiche si occupa di creare le notifiche.
 */
public class ControllerNotifiche {

    private FactoryTipologieNotifiche factoryTipologieNotifiche;

    public ControllerNotifiche() {
        factoryTipologieNotifiche = new FactoryTipologieNotifiche();
    }

    public Notifica creaNotifica(Notifica notifica) {
        return factoryTipologieNotifiche.creaNotifica(notifica);
    }

    public Notifica creaNotifica(TipoNotifica tipoNotifica) {
        return factoryTipologieNotifiche.creaNotifica(tipoNotifica);
    }

}
