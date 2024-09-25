package it.cs.unicam.app_Comune.Model;

import it.cs.unicam.app_Comune.Abstract.Identificabile;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;

@Entity
@NoArgsConstructor (force = true)
@Getter
@Setter

public class ContenutoMultimediale implements Identificabile {

    private String titolo;

    private String descrizione;

    private String url;//percorso da prendere

    private File file;//file da prendere


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContenutoMultimediale; // Rimosso il getter manuale

    public ContenutoMultimediale(String titolo, String descrizione, String url) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.url = url;
    }

    public ContenutoMultimediale(String titolo, String descrizione, String url,File file) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.url = url;
        this.file= file;
    }

    @Override
    public long getID() {
        return this.idContenutoMultimediale;
    }
}
