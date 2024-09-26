package it.cs.unicam.app_Comune.Controller;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import it.cs.unicam.app_Comune.Model.Contenuto;
import it.cs.unicam.app_Comune.Model.ContenutoMultimediale;
import it.cs.unicam.app_Comune.Repository.RepositoryContenutoMultimediale;
import it.cs.unicam.app_Comune.Repository.RepositoryPuntoInteresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contenutoMultimediale")
public class ControllerCaricaContenutiMultimediali {

    @Autowired
    RepositoryPuntoInteresse repositoryPuntoInteresse;

    @Autowired
    RepositoryContenutoMultimediale repositoryContenutoMultimediale;

    public ControllerCaricaContenutiMultimediali() {

    }

    public boolean ricercaPuntoInteresseID(Long idPuntoInteresse) {
        return ottieniPuntoInteresseDaRepository(idPuntoInteresse) != null;
    }

    @PutMapping("/caricaContenuto/{idPunto}/{file}")
    public void caricaContenuto (Long idPunto, ContenutoMultimediale file){
        ottieniPuntoInteresseDaRepository(idPunto).caricaContenuto(file);
        repositoryContenutoMultimediale.save(file);
        repositoryContenutoMultimediale.flush();
    }

    @GetMapping("/visualizzaContenuti/{idPuntoInteresse}/{idContenuto}")
    public ResponseEntity<Object> visualizzareContenuto (@PathVariable("idPuntoInteresse") Long idPuntoInteresse, @PathVariable ("idContenuto")Long idContenuto){
        try {
            Contenuto contenuto = ottieniPuntoInteresseDaRepository(idPuntoInteresse).visualizzareContenuto(idContenuto);
            return new ResponseEntity<>(contenuto, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private PuntoInteresse ottieniPuntoInteresseDaRepository(long idPuntoInteresse){
        return repositoryPuntoInteresse.getReferenceById(idPuntoInteresse);
    }

}

