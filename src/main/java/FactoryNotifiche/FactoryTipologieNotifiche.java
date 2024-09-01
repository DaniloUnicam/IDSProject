package FactoryNotifiche;

public class FactoryTipologieNotifiche {

    public Notifica creaNotifica(TipoNotifica tipoNotifica) {
        return getNotificaByTipo(tipoNotifica);
    }

    public Notifica creaNotifica(Notifica notifica) {
        return getNotificaByTipo(notifica.getTipoNotifica());
    }


    private Notifica getNotificaByTipo(TipoNotifica tipoNotifica) {
        Notifica notificaEnumerata = null;
        switch (tipoNotifica) {
            case NOTIFICA_EVENTO:
                notificaEnumerata = new NotificaEvento();
                break;
            case NOTIFICA_PUNTO_INTERESSE:
                notificaEnumerata = new NotificaPuntoInteresse();
                break;
            case NOTIFICA_ITINERARIO:
                notificaEnumerata = new NotificaItinerario();
                break;
            case NOTIFICA_UTENTE:
                notificaEnumerata = new NotificaUtente();
                break;
            case NOTIFICA_EMERGENZA:
                notificaEnumerata = new NotificaEmergenza();
                break;
            case NOTIFICA_ALTRO:
                notificaEnumerata = new NotificaAltro();
                break;
        }
        return notificaEnumerata;
    }

}
