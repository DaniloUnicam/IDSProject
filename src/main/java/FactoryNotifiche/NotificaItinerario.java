package FactoryNotifiche;

public class NotificaItinerario extends Notifica {

    public NotificaItinerario() {
        super();
        setPriorita(4);
        setTipoNotifica(TipoNotifica.NOTIFICA_ITINERARIO);
    }

}
