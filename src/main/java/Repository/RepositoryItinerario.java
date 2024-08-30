package Repository;

import Model.Itinerario;

import java.util.HashMap;

public class RepositoryItinerario extends GenericRepository<Itinerario> {

    private static RepositoryItinerario repositoryItinerario;

    private RepositoryItinerario() {
        super(new HashMap<String, Itinerario>());
    }

    public static RepositoryItinerario getInstance() {
        if (repositoryItinerario == null) {
            repositoryItinerario = new RepositoryItinerario();
        }
        return repositoryItinerario;
    }

    public void aggiungi(Itinerario itinerariocreato ) {

    }
}
