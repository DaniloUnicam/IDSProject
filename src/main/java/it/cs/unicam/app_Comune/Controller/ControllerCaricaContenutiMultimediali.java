package it.cs.unicam.app_Comune.Controller;
import it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale.HandlerFile;
import org.springframework.web.multipart.MultipartFile;


import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import it.cs.unicam.app_Comune.Model.Contenuto;
import it.cs.unicam.app_Comune.Model.ContenutoMultimediale;
import it.cs.unicam.app_Comune.Repository.RepositoryContenutoMultimediale;
import it.cs.unicam.app_Comune.Repository.RepositoryPuntoInteresse;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("contenutoMultimediale")
public class ControllerCaricaContenutiMultimediali  {

    @Autowired
    RepositoryPuntoInteresse repositoryPuntoInteresse;

    @Autowired
    RepositoryContenutoMultimediale repositoryContenutoMultimediale;

    @Autowired
    HandlerFile handlerFile;

    public ControllerCaricaContenutiMultimediali() {

    }

    public boolean ricercaPuntoInteresseID(Long idPuntoInteresse) {
        return ottieniPuntoInteresseDaRepository(idPuntoInteresse) != null;
    }

    @PostMapping(value = "upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> caricaContenuto (@RequestParam("file") MultipartFile file,
    @PathParam("nome") String nome
            , @PathParam("descrizione") String descrizione){
        try {
            repositoryContenutoMultimediale.save(new ContenutoMultimediale(nome, descrizione, file.getOriginalFilename()));
            handlerFile.saveFile(file);
            repositoryContenutoMultimediale.flush();
            return new ResponseEntity<>("File caricato", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
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

