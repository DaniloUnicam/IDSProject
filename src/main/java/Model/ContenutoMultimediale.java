package Model;

import Abstract.Identificabile;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.File;

@Entity
@Getter
@Setter
@NoArgsConstructor // Crea un costruttore vuoto

public class ContenutoMultimediale extends Identificabile {

    @Getter
    private String titolo;

    @Getter
    private String descrizione;

    @Getter
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
