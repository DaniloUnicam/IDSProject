package FactoryNotifiche;

import Repository.RepositoryNotifiche;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class BachecaNotifiche extends RepositoryNotifiche {

    private LinkedHashMap<String, Notifica> notifiche;

    public BachecaNotifiche() {
        super();
        notifiche = new LinkedHashMap<>();
        sortNotifiche(notifiche);
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
