package Repository;

import Model.InformazioneTerritoriale;

import java.util.HashMap;

public class RepositoryInformazioni extends GenericRepository<InformazioneTerritoriale> {

    private static RepositoryInformazioni instance;

    private RepositoryInformazioni() {
        super(new HashMap<String, InformazioneTerritoriale>());
    }

    public static RepositoryInformazioni getInstance() {
        if (instance == null) {
            instance = new RepositoryInformazioni();
        }
        return instance;
    }
}
