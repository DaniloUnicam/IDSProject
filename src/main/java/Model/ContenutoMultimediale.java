package Model;

import Abstract.Identificabile;

import java.io.File;

public class ContenutoMultimediale extends Identificabile {

    private String titolo;
    private String descrizione;
    private String url;
    private File file;

    private final String id =getIdIncrementazione();

    public ContenutoMultimediale(String titolo, String descrizione, String url) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.url = url;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getUrl() {
        return url;
    }

    public String getID() {
        return id;
    }

}
