package Repository;

import Model.Notifica;

import java.util.HashMap;
import java.util.List;

public class RepositoryNotifiche extends GenericRepository<Notifica> {

    private static RepositoryNotifiche instance;
    private List Notifiche;

    private RepositoryNotifiche() {
        super(new HashMap<String, Notifica>());
    }

    public static RepositoryNotifiche getInstance() {
        if (instance == null) {
            instance = new RepositoryNotifiche();
        }
        return instance;
    }

    public boolean salvaCopiaNotifica(Notifica notifica){
        return false;
    }

}
