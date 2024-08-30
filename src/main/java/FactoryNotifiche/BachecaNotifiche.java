package FactoryNotifiche;

import Repository.RepositoryNotifiche;

import java.util.HashMap;

public class BachecaNotifiche extends RepositoryNotifiche {

    private HashMap<String, Notifica> notifiche;

    public BachecaNotifiche() {
        super();
        this.notifiche = new HashMap<>();
    }

    public void aggiungiNotifica(Notifica notifica) {
        notifiche.put(notifica.getID(), notifica);
    }

    public void ordinaNotifiche() {
        //todo
    }

}
