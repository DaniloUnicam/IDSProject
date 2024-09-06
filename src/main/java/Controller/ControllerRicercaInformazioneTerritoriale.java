package Controller;

import Handler.HandlerInformazione;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

public class ControllerRicercaInformazioneTerritoriale {

    //CONTROLLARE

    private HandlerInformazione handlerInformazione;

    public ControllerRicercaInformazioneTerritoriale () {
        this.handlerInformazione = HandlerInformazione.getInstance();
    }

    public void heandlerInformazione(){}

   public void ricercaInvio(){}

   public void richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia){
         handlerInformazione.richiestaRicerca(ricerca,tipologia);
   }

}
