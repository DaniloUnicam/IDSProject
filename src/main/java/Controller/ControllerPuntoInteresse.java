package Controller;

import Builder.BuilderPuntoInteresse;
import InformazioneTerritoriale.PuntoInteresse;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/puntoInteresse")
@NoArgsConstructor
public class ControllerPuntoInteresse {

    @GetMapping("/creaPuntoInteresse/{idPuntoInteresse}")
    public String creaPuntoInteresse(PuntoInteresse idPuntoInteresse){
        BuilderPuntoInteresse builderPuntoInteresse = new BuilderPuntoInteresse();
        builderPuntoInteresse.getResult(idPuntoInteresse);
        return idPuntoInteresse.getID();
    }

}
