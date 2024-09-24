package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("galleria")
public class ControllerGalleria {

    //idInfo, idUtente
    //public boolean salvaInformazione(String idInformazioneTerritoriale, String idUtente){
    //    return galleria.addContenuto(idInformazioneTerritoriale, idUtente);
    //}


    //idInfo, idUtente
    //@GetMapping("/informazioni/{idInformazioneTerritoriale}/{idUtente}")
    // public List<? extends InformazioneTerritoriale> ottieniInformazione(String idInformazioneTerritoriale,
    //                                                                   String idUtente){
    //}



    //idUtente
    //@GetMapping("/informazioni/{idUtente}")
    //public InformazioniOutputDetailedFormat ricercaInformazione(String idUtente) {
    //    return null;
    //}

    //idInfo
    //public InformazioneTerritoriale[] ottieniInformazioni(String idInformazione){
    //    return RepositoryInformazioni.getInstance().getAll(idInformazione).toArray();
    //}


}
