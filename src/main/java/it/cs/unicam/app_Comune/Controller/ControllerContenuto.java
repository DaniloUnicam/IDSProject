package it.cs.unicam.app_Comune.Controller;

import it.cs.unicam.app_Comune.Model.Contenuto;
import it.cs.unicam.app_Comune.Repository.RepositoryContenuto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("contenuto")
public class ControllerContenuto {
/*
    @Autowired
    RepositoryContenuto repositoryContenuto;

    public ControllerContenuto() {
    }

    @GetMapping("/ottieniContenuto/{idContenuto}")
    public ResponseEntity<Object> ottieniContenuto(@PathVariable("idContenuto") Long idContenuto){
        try {
            Contenuto contenuto = ottieniContenutoDaRepository(idContenuto);
            return new ResponseEntity<>(contenuto, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/aggiungiContenuto")
    public ResponseEntity<Object> aggiungiContenuto(@RequestBody Contenuto contenuto){
        try {
            repositoryContenuto.save(contenuto);
            repositoryContenuto.flush();
            return new ResponseEntity<>("Contenuto aggiunto", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/modificaContenuto/{idContenuto}")
    public ResponseEntity<Object> modificaContenuto(@RequestBody Contenuto contenuto){
        try {
            repositoryContenuto.save(contenuto);
            repositoryContenuto.flush();
            return new ResponseEntity<>("Contenuto modificato", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminaContenuto/{idContenuto}")
    public ResponseEntity<Object> eliminaContenuto(@PathVariable("idContenuto") Long idContenuto){
        try {
            repositoryContenuto.deleteById(idContenuto);
            repositoryContenuto.flush();
            return new ResponseEntity<>("Contenuto eliminato", HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private Contenuto ottieniContenutoDaRepository(Long idContenuto) {
        return repositoryContenuto.findById(idContenuto).orElseThrow(() -> new IllegalArgumentException("Contenuto non trovato"));
    }
    */
}
