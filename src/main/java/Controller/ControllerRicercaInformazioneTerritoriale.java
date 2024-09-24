package Controller;

import HandlerInformazioneTerritoriale.HandlerInformazione;
import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("ricercaInformazioneTerritoriale")
public class ControllerRicercaInformazioneTerritoriale {

    @Autowired
    HandlerInformazione handlerInformazione;

    public void handlerInformazione(){}

    public ControllerRicercaInformazioneTerritoriale () {
    }
/*
   public List<InformazioneTerritoriale> richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia){
         return handlerInformazione.richiestaRicerca(ricerca,tipologia);
   }
*/
}
