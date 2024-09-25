package it.cs.unicam.app_Comune.Controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import it.cs.unicam.app_Comune.Builder.BuilderPuntoInteresse;
import it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale.HandlerInformazione;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/puntoInteresse")
@NoArgsConstructor
public class ControllerPuntoInteresse {

    @Autowired
    private BuilderPuntoInteresse builderPuntoInteresse;

    @PostMapping("/creaPuntoInteresse")
    public long creaPuntoInteresse(@RequestBody PuntoInteresse idPuntoInteresse){
        builderPuntoInteresse = new BuilderPuntoInteresse();
        builderPuntoInteresse.getResult(idPuntoInteresse);
        return idPuntoInteresse.getID();
    }




}
