package it.cs.unicam.app_Comune.Controller;
import it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale.HandlerFile;
import it.cs.unicam.app_Comune.Repository.RepositoryContenuto;
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

import java.io.IOException;

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

    @PostMapping(value = "caricaContenuto/{idPunto}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> caricaContenutoMultimedialeSuPuntoInteresse(@PathVariable("idPunto") String idPunto,
                                             @RequestParam("file") MultipartFile file,
                                             @RequestParam("nome") String nome,
                                             @RequestParam("descrizione") String descrizione) throws IOException {
        try {
            ContenutoMultimediale contenutoMultimediale = new ContenutoMultimediale(nome, descrizione, file.getOriginalFilename());
            handlerFile.saveFile(file);
            repositoryContenutoMultimediale.save(contenutoMultimediale);
            return new ResponseEntity<>("File caricato con successo", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/caricaContenutoMultimediale", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> caricaContenutoMultimediale(@RequestParam("file") MultipartFile file,
                                                  @RequestParam("nome") String nome,
                                                  @RequestParam("descrizione") String descrizione) throws IOException {
        try {
            ContenutoMultimediale contenutoMultimediale = new ContenutoMultimediale(nome, descrizione, file.getOriginalFilename());
            handlerFile.saveFile(file);
            repositoryContenutoMultimediale.save(contenutoMultimediale);
            return new ResponseEntity<>("File caricato con successo", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/ottieniContenutoPuntoInteresse/{idPuntoInteresse}/{idContenuto}")
    public ResponseEntity<Object> ottieniContenutoPuntoInteresse(@PathVariable("idPuntoInteresse") Long idPuntoInteresse, @PathVariable ("idContenuto")Long idContenuto){
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

