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

    /**
     * Crea un punto di interesse utilizzando il builder, a partire dai dati passati nel body della richiesta.
     * @param puntoInteresseInputFormat
     * @return
     */
    @PostMapping("/creaPuntoInteresse")
    public ResponseEntity<PuntoInteresse> creaPuntoInteresse(@RequestBody PuntoInteresseInputFormat puntoInteresseInputFormat) {
            this.builderPuntoInteresse = new BuilderPuntoInteresse();
            buildPoiInputFormat(puntoInteresseInputFormat);
            PuntoInteresse puntoInteresse = builderPuntoInteresse.getResult();
            repositoryPuntoInteresse.save(puntoInteresse);
            repositoryPuntoInteresse.flush();
            return new ResponseEntity<>(puntoInteresse, HttpStatus.OK);
    }

    /**
     * Effettua la valutazione di un punto di interesse.
     * @param idPuntoInteresse
     * @param valutazione
     * @return ResponseEntity con l'id del punto di interesse valutato
     */
    @PutMapping("/effettuaValutazione/{idPuntoInteresse}/{valutazione}")
    public ResponseEntity<Object> effettuaValutazione(@PathVariable("idPuntoInteresse") long idPuntoInteresse, @PathVariable("valutazione") double valutazione) {
        PuntoInteresse puntoInteresse = repositoryPuntoInteresse.getReferenceById(idPuntoInteresse);
        puntoInteresse.aggiungiValutazione(valutazione);
        repositoryPuntoInteresse.flush();
        return new ResponseEntity<>("Valutazione effettuata, nuova valutazione: "+ puntoInteresse.getValutazione(), HttpStatus.OK);
    }


    //Il builder viene costruito con i dati passati dal body della richiesta
    private void buildPoiInputFormat(PuntoInteresseInputFormat puntoInteresseInputFormat) {
        this.builderPuntoInteresse.buildNome(puntoInteresseInputFormat.getNome());
        this.builderPuntoInteresse.buildDescrizione(puntoInteresseInputFormat.getDescrizione());
        this.builderPuntoInteresse.buildOrarioApertura(puntoInteresseInputFormat.getOrarioApertura());
        this.builderPuntoInteresse.buildOrarioChiusura(puntoInteresseInputFormat.getOrarioChiusura());
        this.builderPuntoInteresse.buildTipoPuntoInteresse(puntoInteresseInputFormat.getTipo());
        this.builderPuntoInteresse.buildValutazione(puntoInteresseInputFormat.getValutazione());
        this.builderPuntoInteresse.buildPosizioneSatellitare(puntoInteresseInputFormat.getPosizioneSatellitareInputFormat());
    }

    @GetMapping("/getPuntoInteresse/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable("id") Long id) {
        return new ResponseEntity<>(repositoryPuntoInteresse.findById(id), HttpStatus.OK);
    }


}
