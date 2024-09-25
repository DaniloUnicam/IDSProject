package it.cs.unicam.app_Comune.FactoryNotifiche;

public class FactoryTipologieNotifiche {

    //@use private Notifica creaNotificaByTipo(TipoNotifica tipoNotifica);
    public Notifica creaNotifica(TipoNotifica tipoNotifica) {
        return creaNotificaByTipo(tipoNotifica);
    }

    //@use private Notifica creaNotificaByTipo(TipoNotifica tipoNotifica);
    public Notifica creaNotifica(Notifica notifica) {
        return creaNotificaByTipo(notifica.getTipoNotifica());
    }

    /**
     * Metodo che crea una notifica in base al tipo di notifica passato come parametro.
     *
     * @param tipoNotifica tipo di notifica da creare (enumerazione)
     * @return notifica creata in base al tipo di notifica
     */
    private Notifica creaNotificaByTipo(TipoNotifica tipoNotifica) {
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
