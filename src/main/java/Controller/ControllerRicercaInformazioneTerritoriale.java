package Controller;

import HandlerInformazioneTerritoriale.HandlerInformazione;
import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.List;

public class ControllerRicercaInformazioneTerritoriale {

    //CONTROLLARE
    //RICERCA INVIO NON LO FACCIAMO PIù?
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
