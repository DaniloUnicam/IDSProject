package FactoryNotifiche;

public class NotificaPuntoInteresse extends Notifica {

    public NotificaPuntoInteresse() {
        super();
        setPriorita(3);
        setTipoNotifica(TipoNotifica.NOTIFICA_PUNTO_INTERESSE);
    }

}
