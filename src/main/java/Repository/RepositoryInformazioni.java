package Repository;



import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.ArrayList;
import java.util.List;

public class RepositoryInformazioni {

    private RepositoryEvento eventi;
    private RepositoryPuntoInteresse poi;
    private RepositoryItinerario itinerari;
    private static RepositoryInformazioni repositoryInformazioni;

    private RepositoryInformazioni() {    }

    public static RepositoryInformazioni getInstance() {
        if (repositoryInformazioni == null) {
            repositoryInformazioni = new RepositoryInformazioni();
        }
        return repositoryInformazioni;
    }

    public List< InformazioneTerritoriale> richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia) {
        switch (tipologia) {
            case EVENTO:
                return ricercaStringa(ricerca, eventi);
            case POI:
                return ricercaStringa(ricerca, poi);
            case ITINERARIO:
                return ricercaStringa(ricerca, itinerari);
            default:
                return null;
        }
    }

    public List< InformazioneTerritoriale> ricercaStringa (String ricerca, GenericRepository<? extends InformazioneTerritoriale> repository) {
        List  <InformazioneTerritoriale> informazioni= new  ArrayList<InformazioneTerritoriale>();
          for(InformazioneTerritoriale informazione : repository.getAll()) {
              if(informazione.getNome().contains(ricerca)) {//oppure nella descrizione
                    informazioni.add(informazione);
              }
          }
          return  informazioni;
    }



}
