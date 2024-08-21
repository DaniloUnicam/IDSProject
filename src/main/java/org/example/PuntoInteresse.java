package org.example;

import java.io.File;

public class PuntoInteresse {

    private String nome;
    private final String ID;
    private String descrizione;
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private TipoStruttura tipo;
    private float valutazione;
    private PosizioneSatellitare posizione;

    public PuntoInteresse (String ID, String descrizione, Orario orarioApertura, Orario orarioChiusura, TipoStruttura tipo, float valutazione, PosizioneSatellitare posizione) {
        this.ID = ID;
        this.descrizione = descrizione;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
        this.valutazione = valutazione;
        this.posizione = posizione;
    }

    public String getID () {
        return ID;
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

    public TipoStruttura getTipo () {
        return tipo;
    }
    public float getValutazione () {
        return valutazione;
    }

    public PosizioneSatellitare getPosizione () {
        return posizione;
    }

    /* TODO implementare
    public void caricaContenuto(File file, String Commento) {

    }

    public PuntoInteresse visualizzareContenuti(String id) {
        return null;
    }

    public Recensione commentaRecensione(Recensione recensione){

    }

    */
}
