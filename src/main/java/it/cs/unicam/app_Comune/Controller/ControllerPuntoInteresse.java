package it.cs.unicam.app_Comune.Controller;

import it.cs.unicam.app_Comune.Builder.BuilderPuntoInteresse;
import it.cs.unicam.app_Comune.Dtos.inputFormat.PuntoInteresseInputFormat;
import it.cs.unicam.app_Comune.Repository.RepositoryPuntoInteresse;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("puntoInteresse")
@NoArgsConstructor
public class ControllerPuntoInteresse {


    @Autowired
    private BuilderPuntoInteresse builderPuntoInteresse;

    @Autowired
    private RepositoryPuntoInteresse repositoryPuntoInteresse;

    @PostMapping("/creaPuntoInteresse")
    public ResponseEntity<PuntoInteresse> creaPuntoInteresse(@RequestBody PuntoInteresseInputFormat puntoInteresseInputFormat) {
        this.builderPuntoInteresse = new BuilderPuntoInteresse();
        buildPoiInputFormat(puntoInteresseInputFormat);
        PuntoInteresse puntoInteresse = builderPuntoInteresse.getResult();
        repositoryPuntoInteresse.save(puntoInteresse);
        repositoryPuntoInteresse.flush();
        return new ResponseEntity<>(puntoInteresse, HttpStatus.OK);
    }


    //Il builder viene costruito con i dati passati dal body della richiesta
    private void buildPoiInputFormat(PuntoInteresseInputFormat puntoInteresseInputFormat) {
        this.builderPuntoInteresse.buildNome(puntoInteresseInputFormat.getNome());
        this.builderPuntoInteresse.buildDescrizione(puntoInteresseInputFormat.getDescrizione());
        this.builderPuntoInteresse.buildOrarioApertura(puntoInteresseInputFormat.getOrarioApertura());
        this.builderPuntoInteresse.buildOrarioChiusura(puntoInteresseInputFormat.getOrarioChiusura());
        this.builderPuntoInteresse.buildTipoPuntoInteresse(puntoInteresseInputFormat.getTipo());
        this.builderPuntoInteresse.buildValutazione(puntoInteresseInputFormat.getValutazione());
        this.builderPuntoInteresse.buildPosizioneSatellitare(puntoInteresseInputFormat.getPosizione());
    }

    @GetMapping("/getPuntoInteresse/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable("id") Long id) {
        return new ResponseEntity<>(repositoryPuntoInteresse.findById(id), HttpStatus.OK);
    }


}
