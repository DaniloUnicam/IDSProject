package FactoryNotifiche;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class BachecaNotifiche {

    private LinkedHashMap<String, Notifica> notifiche;

    public BachecaNotifiche() {
        this.notifiche = new LinkedHashMap<>();
    }

    public void aggiungiNotifica(Notifica notifica) {
        this.notifiche.put(notifica.getID(), notifica);
        sortNotifiche(this.notifiche);
    }

    public void rimuoviNotifica(String idNotifica) {
        this.notifiche.remove(idNotifica);
        sortNotifiche(this.notifiche);
    }

    public void segnaNotificaComeLetta(String idNotifica) {
        this.notifiche.get(idNotifica).setLetta(true);
    }

    public void segnaNotificaComeNonLetta(String idNotifica) {
        this.notifiche.get(idNotifica).setLetta(false);
    }

    public void segnaTutteNotificheComeLette() {
        this.notifiche.forEach((k, v) -> v.setLetta(true));
    }

    public void segnaTutteNotificheComeNonLette() {
        this.notifiche.forEach((k, v) -> v.setLetta(false));
    }

    public void rimuoviTutteNotifiche() {
        this.notifiche.clear();
    }

    public LinkedHashMap<String, Notifica> getNotifiche() {
        return this.notifiche;
    }

    public Notifica getNotifica(String idNotifica) {
        return this.notifiche.get(idNotifica);
    }

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
