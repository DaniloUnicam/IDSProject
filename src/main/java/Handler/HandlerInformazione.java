package Handler;

import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.List;

// DA CONTROLLARE
public class HandlerInformazione {

    private static HandlerInformazione handlerInformazione;
    public List<InformazioneTerritoriale> richiestaRicerca(String ricerca , TipoInformazioneTerritoriale tipologia){
        return null;
    }
    public static HandlerInformazione getInstance(){
        if(handlerInformazione == null) {
            handlerInformazione = new HandlerInformazione();
        }
        return handlerInformazione;
    }

}
