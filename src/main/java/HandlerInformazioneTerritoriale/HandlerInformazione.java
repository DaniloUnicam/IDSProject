package HandlerInformazioneTerritoriale;

import InformazioneTerritoriale.InformazioneTerritoriale;
import Repository.RepositoryInformazioni;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

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

    public List<InformazioneTerritoriale> richiestaRicerca(String informazioneDaRicercare, TipoInformazioneTerritoriale tipologia) {
        List  <InformazioneTerritoriale> informazioni= new ArrayList<>();
        for(InformazioneTerritoriale informazione : repositoryInformazioni.getAll(tipologia)) {
            if(informazione.getNome().contains(informazioneDaRicercare)) {
                informazioni.add(informazione);
            }
        }
        return  informazioni;
    }


}
