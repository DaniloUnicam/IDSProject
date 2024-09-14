package Controller;

import FactoryNotifiche.FactoryTipologieNotifiche;
import FactoryNotifiche.Notifica;
import FactoryNotifiche.TipoNotifica;
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
