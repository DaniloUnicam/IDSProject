package org.example;

public class PuntoInteresse {

    private String nome;

    private String nome;
    private String descrizione;
    private String indirizzo;
    private String orarioApertura;
    private String orarioChiusura;
    private float valutazioneMedia;

    public PuntoInteresse(String nome, String descrizione, String indirizzo, String orarioApertura, String orarioChiusura, float valutazioneMedia) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.indirizzo = indirizzo;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.valutazioneMedia = valutazioneMedia;
    }

    public String getNome () {
        return nome;
    }

    public String getDescrizione () {
        return descrizione;
    }

    public String getIndirizzo () {
        return indirizzo;
    }

    public String getOrarioApertura () {
        return orarioApertura;
    }

    public String getOrarioChiusura () {
        return orarioChiusura;
    }

    public float getValutazioneMedia () {
        return valutazioneMedia;
    }

}
