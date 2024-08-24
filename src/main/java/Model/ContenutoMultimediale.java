package Model;

import Interfacce.Identificabile;

import java.io.File;

public class ContenutoMultimediale implements Identificabile {

    private String id;
    private String titolo;
    private String descrizione;
    private String url;
    private File file;

    public ContenutoMultimediale(String id, String titolo, String descrizione, String url) {
        this.id = id;
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
