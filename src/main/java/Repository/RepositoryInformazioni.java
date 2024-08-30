package Repository;

import Model.InformazioneTerritoriale;

import java.util.HashMap;

public class RepositoryInformazioni extends GenericRepository<InformazioneTerritoriale> {

    private static RepositoryInformazioni repositoryInformazioni;

    private RepositoryInformazioni() {
        super(new HashMap<String, InformazioneTerritoriale>());
    }

    public static RepositoryInformazioni getInstance() {
        if (repositoryInformazioni == null) {
            repositoryInformazioni = new RepositoryInformazioni();
        }
        return repositoryInformazioni;
    }


}
