package FactoryNotifiche;

public class FactoryTipologieNotifiche {

    public Notifica creaNotifica(TipoNotifica tipoNotifica) {
        Notifica notifica = null;
        switch (tipoNotifica) {
            case NOTIFICA_EVENTO:
                notifica = new NotificaEvento();
                break;
            case NOTIFICA_PUNTO_INTERESSE:
                notifica = new NotificaPuntoInteresse();
                break;
            case NOTIFICA_ITINERARIO:
                notifica = new NotificaItinerario();
                break;
            case NOTIFICA_UTENTE:
                notifica = new NotificaUtente();
                break;
            case NOTIFICA_EMERGENZA:
                notifica = new NotificaEmergenza();
                break;
            case NOTIFICA_ALTRO:
                notifica = new NotificaAltro();
                break;
        }
        return notifica;
    }

    public Notifica creaNotifica(Notifica notifica) {
        TipoNotifica tipoNotifica = notifica.getTipoNotifica();
        switch (tipoNotifica) {
            case NOTIFICA_EVENTO:
                notifica = new NotificaEvento();
                break;
            case NOTIFICA_PUNTO_INTERESSE:
                notifica = new NotificaPuntoInteresse();
                break;
            case NOTIFICA_ITINERARIO:
                notifica = new NotificaItinerario();
                break;
            case NOTIFICA_UTENTE:
                notifica = new NotificaUtente();
                break;
            case NOTIFICA_EMERGENZA:
                notifica = new NotificaEmergenza();
                break;
            case NOTIFICA_ALTRO:
                notifica = new NotificaAltro();
                break;
        }
        return notifica;
    }



}
