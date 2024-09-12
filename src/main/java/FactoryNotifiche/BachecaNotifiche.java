package FactoryNotifiche;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class BachecaNotifiche {

    //Notifiche presenti nella bacheca
    private LinkedHashMap<String, Notifica> notifiche;

    public BachecaNotifiche() {
        this.notifiche = new LinkedHashMap<>();
    }

    //Aggiunge una notifica alla bacheca
    public void aggiungiNotifica(Notifica notifica) {
        this.notifiche.put(notifica.getID(), notifica);
        sortNotifiche(this.notifiche);
    }
    //Rimuove una notifica dalla bacheca
    public void rimuoviNotifica(Notifica notifica) {
        this.notifiche.remove(notifica.getID(), notifica);
        sortNotifiche(this.notifiche);
    }

    //Segna una notifica dalla bacheca come letta tramite l'id
    public void segnaNotificaComeLetta(String idNotifica) {
        this.notifiche.get(idNotifica).setLetta(true);
    }

    //Segna una notifica come non letta tramite l'id
    public void segnaNotificaComeNonLetta(String idNotifica) {
        this.notifiche.get(idNotifica).setLetta(false);
    }

    //Segna tutte le notifiche come lette
    public void segnaTutteNotificheComeLette() {
        this.notifiche.forEach((k, v) -> v.setLetta(true));
    }

    //Segna tutte le notifiche come non lette
    public void segnaTutteNotificheComeNonLette() {
        this.notifiche.forEach((k, v) -> v.setLetta(false));
    }

    //Rimuove tutte le notifiche dalla bacheca
    public void rimuoviTutteNotifiche() {
        this.notifiche.clear();
    }

    public LinkedHashMap<String, Notifica> getNotifiche() {
        return this.notifiche;
    }

    public Notifica getNotifica(String idNotifica) {
        return this.notifiche.get(idNotifica);
    }

    /**
     * Ordina le notifiche in base alla priorità (dal più alto al più basso, 1-5)
     * @param notifiche con le notifiche da ordinare
     * @return LinkedHashMap<String, Notifica> con le notifiche ordinate
     */
    public LinkedHashMap<String, Notifica> sortNotifiche(HashMap<String, Notifica> notifiche) {
        return notifiche.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().getPriorita()))
                .collect(Collectors.toMap(
                        HashMap.Entry::getKey,
                        HashMap.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
    }

}
