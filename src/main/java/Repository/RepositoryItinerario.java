package Repository;

import Model.Itinerario;

import java.util.HashMap;

public class RepositoryItinerario extends GenericRepository<Itinerario> {

    private static RepositoryItinerario instance;

    private RepositoryItinerario() {
        super(new HashMap<String, Itinerario>());
    }

    public static RepositoryItinerario getInstance() {
        if (instance == null) {
            instance = new RepositoryItinerario();
        }
        return instance;
    }
}
