package it.cs.unicam.app_Comune.Controller;

import it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale.HandlerInformazione;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.InformazioneTerritoriale;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoInformazioneTerritoriale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("ricercaInformazioneTerritoriale")
public class ControllerRicercaInformazioneTerritoriale {

    @Autowired
    HandlerInformazione handlerInformazione;

    public ControllerRicercaInformazioneTerritoriale () {
    }
   @GetMapping("richiestaRicerca/{ricerca}/{tipologia}")
   public List<InformazioneTerritoriale> richiestaRicerca(String ricerca, TipoInformazioneTerritoriale tipologia){
         return handlerInformazione.richiestaRicerca(ricerca,tipologia);
   }

}
