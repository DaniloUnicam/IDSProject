package org.example;
public class PuntoInteresse {
    private String nome;
    private String descrizione;
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private String tipo;
    private float valutazione;
    private PosizioneSatellitare posizione;

    public PuntoInteresse(String nome, String descrizione, Orario orarioApertura, Orario orarioChiusura, String tipo, float valutazione, PosizioneSatellitare posizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
        this.valutazione = valutazione;
        this.posizione = posizione;
    }

    public String getNome () {
        return nome;
    }

    public String getDescrizione () {
        return descrizione;
    }

    public Orario getOrarioApertura () {
        return orarioApertura;
    }

    public Orario getOrarioChiusura () {
        return orarioChiusura;
    }

    public String getTipo () {
        return tipo;
    }

    public float getValutazione () {
        return valutazione;
    }

    public PosizioneSatellitare getPosizione () {
        return posizione;
    }
}