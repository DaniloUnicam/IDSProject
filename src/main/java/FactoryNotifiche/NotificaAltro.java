package FactoryNotifiche;

public class NotificaAltro extends Notifica {

    public NotificaAltro() {
        super();
        setTesto("Notifica non specificata");
        this.setTipoNotifica(TipoNotifica.NOTIFICA_ALTRO);
        setPriorita(5);
    }

}
