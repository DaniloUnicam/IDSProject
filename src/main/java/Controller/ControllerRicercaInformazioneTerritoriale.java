package Controller;

import HandlerInformazioneTerritoriale.HandlerInformazione;
import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.List;
//TODO
public class ControllerRicercaInformazioneTerritoriale {

    //Il gestore della informazione ricerca deve essere usata dal controller
    private HandlerInformazione handlerInformazione;

    public void handlerInformazione(){}

    public ControllerRicercaInformazioneTerritoriale () {
        this.handlerInformazione = HandlerInformazione.getInstance();
    }

   public List<InformazioneTerritoriale> richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia){
         return handlerInformazione.richiestaRicerca(ricerca,tipologia);
   }

}
