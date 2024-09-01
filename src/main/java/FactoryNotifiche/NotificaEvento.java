package FactoryNotifiche;

public class NotificaEvento extends Notifica {

    public NotificaEvento() {
        super();
        setPriorita(3);
        setTipoNotifica(TipoNotifica.NOTIFICA_EVENTO);
    }

}
