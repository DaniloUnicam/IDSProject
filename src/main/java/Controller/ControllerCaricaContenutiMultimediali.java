package Controller;

import InformazioneTerritoriale.PuntoInteresse;
import Model.Contenuto;
import Model.ContenutoMultimediale;
import Repository.RepositoryPuntoInteresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contenutoMultimediale")
public class ControllerCaricaContenutiMultimediali {

    @Autowired
    RepositoryPuntoInteresse repositoryPuntoInteresse;

    public ControllerCaricaContenutiMultimediali() {

    }

    public boolean ricercaPuntoInteresseID(String idPuntoInteresse) {
        return ottieniPuntoInteresseDaRepository(idPuntoInteresse) != null;
    }

    @GetMapping("caricaContenuto/{idPunto}/{file}")
    public void caricaContenuto (String idPunto, ContenutoMultimediale file){
        ottieniPuntoInteresseDaRepository(idPunto).caricaContenuto(file);
    }

    @GetMapping("visualizzaContenuti/{idPuntoInteresse}/{idContenuto}")
    public ResponseEntity<Object> visualizzareContenuto (@PathVariable("idPuntoInteresse") String idPuntoInteresse, @PathVariable ("idContenuto")String idContenuto){
        try {
            Contenuto contenuto = ottieniPuntoInteresseDaRepository(idPuntoInteresse).visualizzareContenuto(idContenuto);
            return new ResponseEntity<>(contenuto, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private PuntoInteresse ottieniPuntoInteresseDaRepository(String idPuntoInteresse){
        return repositoryPuntoInteresse.findById(idPuntoInteresse).get();
    }

}

