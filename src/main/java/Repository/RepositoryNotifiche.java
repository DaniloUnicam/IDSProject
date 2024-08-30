package Repository;

import Model.Notifica;

import java.util.HashMap;
import java.util.List;

public class RepositoryNotifiche extends GenericRepository<Notifica> {

    private static RepositoryNotifiche repositoryNotifiche;
    private List<Notifica> notifiche;

    private RepositoryNotifiche() {
        super(new HashMap<String, Notifica>());
    }

    public static RepositoryNotifiche getInstance() {
        if (repositoryNotifiche == null) {
            repositoryNotifiche = new RepositoryNotifiche();
        }
        return repositoryNotifiche;
    }

    public void salvaCopiaNotifica(Notifica notifica){
        if(notifica != null){
            this.add(notifica);
        }
    }

}
