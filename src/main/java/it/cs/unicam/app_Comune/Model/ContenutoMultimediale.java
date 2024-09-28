// src/main/java/it/cs/unicam/app_Comune/Model/ContenutoMultimediale.java
package it.cs.unicam.app_Comune.Model;

import it.cs.unicam.app_Comune.Abstract.Identificabile;
import it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale.HandlerFile;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Entity
@NoArgsConstructor(force = true)
@Getter
@Setter
public class ContenutoMultimediale implements Identificabile {

    private String titolo;
    private String descrizione;
    private File file; // file da prendere
    private String url;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContenutoMultimediale;


    public ContenutoMultimediale(String titolo, String descrizione, String url, File file) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.file = file;
        this.url = url;
    }

    public ContenutoMultimediale(String titolo, String descrizione, String url) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.url = url;
    }

    @Override
    public long getID() {
        return this.idContenutoMultimediale;
    }

    public String getUrl() {
        return this.file.getPath();
    }
}