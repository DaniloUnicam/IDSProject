package Model;

import Abstract.Identificabile;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;

@Entity
@NoArgsConstructor (force = true)
@Getter
@Setter

public class ContenutoMultimediale extends Identificabile {

    private String titolo;

    private String descrizione;

    private String url;

    private File file;

    @Id
    private final String id = getIdIncrementazione(); // Rimosso il getter manuale

    public ContenutoMultimediale(String titolo, String descrizione, String url) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.url = url;
    }

    @Override
    public String getID() {
        return this.id;
    }
}
