package Controller;

import Handler.HandlerInformazione;
import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

public class ControllerRicercaInformazioneTerritoriale {

    //CONTROLLARE
    //RICERCA INVIO NON LO FACCIAMO PIù?
    //Il gestore della informazione ricerca deve essere usata dal controller
    private HandlerInformazione handlerInformazione;

    public ControllerRicercaInformazioneTerritoriale () {
        this.handlerInformazione = HandlerInformazione.getInstance();
    }

    public void handlerInformazione(){}

   public  richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia){
         return handlerInformazione.richiestaRicerca(ricerca,tipologia);
   }

}
