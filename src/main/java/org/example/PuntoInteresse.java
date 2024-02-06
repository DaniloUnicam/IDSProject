package org.example;
public class PuntoInteresse {
    private String ID;
    private String descrizione;
    private Orario orarioApertura;
    private Orario orarioChiusura;

    private enum tipoStruttura {
        MUSEO, RISTORANTE, PIZZERIA, ALBERGO, MONUMENTO, STATUA, NEGOZIO, SCUOLA, CHIESA, PARCO, PARCHEGGIO,
        CENTRO_COMMERCIALE, AUTOVELOX, ATTRAZIONE_TURISTICA, ALTRO
    };

    private float valutazione;
    private PosizioneSatellitare posizione;

    public PuntoInteresse (String ID, String descrizione, Orario orarioApertura, Orario orarioChiusura, float valutazione, PosizioneSatellitare posizione) {
        this.ID = ID;
        this.descrizione = descrizione;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
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


    public float getValutazione () {
        return valutazione;
    }

    public PosizioneSatellitare getPosizione () {
        return posizione;
    }
}