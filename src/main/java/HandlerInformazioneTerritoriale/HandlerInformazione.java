package HandlerInformazioneTerritoriale;

import InformazioneTerritoriale.InformazioneTerritoriale;
import Repository.RepositoryInformazioni;

import java.util.ArrayList;
import java.util.List;

public class HandlerInformazione {

    public static HandlerInformazione handlerInformazione;

    RepositoryInformazioni repositoryInformazioni =  RepositoryInformazioni.getInstance();

    public static HandlerInformazione getInstance(){
        if(handlerInformazione == null) {
            handlerInformazione = new HandlerInformazione();
        }
        return handlerInformazione;
    }


    public List<InformazioneTerritoriale> richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia) {
        List  <InformazioneTerritoriale> informazioni= new ArrayList<InformazioneTerritoriale>();
        for(InformazioneTerritoriale informazione : repositoryInformazioni.getAll(tipologia)) {
            if(informazione.getNome().contains(ricerca)) {
                informazioni.add(informazione);
            }
        }
        return  informazioni;
    }


}
