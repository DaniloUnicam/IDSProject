package Repository;

import InformazioneTerritoriale.Evento;

import java.util.HashMap;

public class RepositoryEvento extends GenericRepository<Evento> {

    private static RepositoryEvento repositoryEvento;

    private RepositoryEvento() {
        super(new HashMap<String, Evento>());
    }

    public static RepositoryEvento getInstance() {
        if (repositoryEvento == null) {
            repositoryEvento = new RepositoryEvento();
        }
        return repositoryEvento;
    }

    public Evento[] richiesta(){
        return null;
        //TODO
    }
}
