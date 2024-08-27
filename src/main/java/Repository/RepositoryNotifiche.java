package Repository;

import Model.Notifica;

import java.util.HashMap;

public class RepositoryNotifiche extends GenericRepository<Notifica> {

    private static RepositoryNotifiche instance;

    private RepositoryNotifiche() {
        super(new HashMap<String, Notifica>());
    }

    public static RepositoryNotifiche getInstance() {
        if (instance == null) {
            instance = new RepositoryNotifiche();
        }
        return instance;
    }

}
