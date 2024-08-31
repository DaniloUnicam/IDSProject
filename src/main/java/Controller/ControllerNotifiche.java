package Controller;

import FactoryNotifiche.FactoryTipologieNotifiche;
import FactoryNotifiche.Notifica;

public class ControllerNotifiche {
    //TODO

    public Notifica creaNotifica(Notifica notifica){
        FactoryTipologieNotifiche factoryNotifiche = new FactoryTipologieNotifiche();
        Notifica notificaCreata = factoryNotifiche.creaNotifica(notifica);
        return notificaCreata;
    }

}
