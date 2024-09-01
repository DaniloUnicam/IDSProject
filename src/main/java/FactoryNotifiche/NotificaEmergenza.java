package FactoryNotifiche;

public class NotificaEmergenza extends Notifica {

    public NotificaEmergenza() {
        super();
        setPriorita(1.0f);
        setTipoNotifica(TipoNotifica.NOTIFICA_EMERGENZA);
    }


}
