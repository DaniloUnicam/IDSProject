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
import java.util.List;

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

    /**
     * Carica un contenuto multimediale su un punto di interesse tramite il suo id.
     * @param idPunto
     * @param file
     * @param nome
     * @param descrizione
     * @return ResponseEntity con l'id del contenuto multimediale caricato
     * @throws IOException
     */
    @PostMapping(value = "caricaContenutoMultimedialeSuPuntoInteresse/{idPunto}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> caricaContenutoMultimedialeSuPuntoInteresse(@PathVariable("idPunto") long idPunto,
                                             @RequestParam("file") MultipartFile file,
                                             @RequestParam("nome") String nome,
                                             @RequestParam("descrizione") String descrizione) throws IOException {
        try {
            ContenutoMultimediale contenutoMultimediale = new ContenutoMultimediale(nome, descrizione, file.getOriginalFilename());
            //salva il file nel file system /src/main/resources/Files
            handlerFile.saveFile(file);
            repositoryContenutoMultimediale.save(contenutoMultimediale);
            repositoryContenutoMultimediale.flush();
            repositoryPuntoInteresse.getReferenceById((idPunto)).caricaContenuto(contenutoMultimediale);
            return new ResponseEntity<>("File caricato con successo, id del file: " + contenutoMultimediale.getID(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**Carica un contenuto multimediale nel database e restituisce l'id del contenuto multimediale caricato.
     * @param file
     * @param nome
     * @param descrizione
     * @return ResponseEntity con l'id del contenuto multimediale caricato
     * @throws IOException
     */
    @PostMapping(value = "/caricaContenutoMultimediale", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> caricaContenutoMultimediale(@RequestParam("file") MultipartFile file,
                                                  @RequestParam("nome") String nome,
                                                  @RequestParam("descrizione") String descrizione) throws IOException {
        try {
            ContenutoMultimediale contenutoMultimediale = new ContenutoMultimediale(nome, descrizione, file.getOriginalFilename());
            handlerFile.saveFile(file);
            repositoryContenutoMultimediale.save(contenutoMultimediale);
            return new ResponseEntity<>("File caricato con successo, id del file: " + contenutoMultimediale.getID(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Rimuove un contenuto multimediale tramite il suo id,
     * rimuovendo anche i riferimenti ad esso nei punti di interesse.
     * @param idContenutoMultimediale
     * @return
     */
    @DeleteMapping("/rimuoviContenutoMultimediale/{idContenutoMultimediale}")
    public ResponseEntity<Object> rimuoviContenutoMultimediale(@PathVariable("idContenutoMultimediale") long idContenutoMultimediale) {
        try {
            //Rimuove il riferimento al contenuto multimediale nei punti di interesse
            List<PuntoInteresse> puntiInteresse = repositoryPuntoInteresse.findAll();
            for (PuntoInteresse punto : puntiInteresse) {
                punto.rimuoviContenuto(idContenutoMultimediale);
                repositoryPuntoInteresse.save(punto);
            }
            repositoryPuntoInteresse.flush();

            //Rimuove il contenuto multimediale dal database
            repositoryContenutoMultimediale.deleteById(idContenutoMultimediale);
            repositoryContenutoMultimediale.flush();

            return new ResponseEntity<>("Contenuto multimediale: " + idContenutoMultimediale + " rimosso con successo", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Ottiene un contenuto multimediale tramite il suo id dal database.
     * @param idContenuto
     * @return ResponseEntity con il contenuto multimediale.
     */
    @GetMapping("/ottieniContenutoPuntoInteresse/{idPuntoInteresse}/{idContenuto}")
    public ResponseEntity<Object> ottieniContenutoPuntoInteresse(@PathVariable("idPuntoInteresse") long idPuntoInteresse, @PathVariable ("idContenuto")Long idContenuto){
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

