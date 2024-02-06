package org.example;
public class PuntoInteresse {

    private String nome;
    private String ID;
    private String descrizione;
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private String tipo;
    private float valutazione;
    private PosizioneSatellitare posizione;


    private enum tipoStruttura {
        AEROPORTO, ALBERGO, ALTRO, ATTRAZIONE_TURISTICA, AUTOVELOX, CAMPO_BASEBALL,
        CAMPO_BASKET, CAMPO_BOCCE, CAMPO_BOCCETTE, CAMPO_BOWLING, CAMPO_CALCIO,
        CAMPO_CRICKET, CAMPO_GOLF, CAMPO_HOCKEY, CAMPO_LACROSSE,
        CAMPO_PALLAMANO, CAMPO_PALLAVOLO, CAMPO_RUGBY, CAMPO_SOFTBALL, CAMPO_SQUASH,
        CAMPO_TENNIS, CASCATA, CASERMA_CARABINIERI, CASERMA_POLIZIA,
        CATENE_MONTUOSE, CENTRO_COMMERCIALE, CHIESA, CINEMA, COMUNE, FARMACIA,
        FERMATA_BUS, FERMATA_METRO, FERMATA_TRAM, FERMATA_TRENO,
        MONUMENTO, MUSEO, NEGOZIO, OSPEDALE, PALESTRA, PARCHEGGIO,
        PARCO, PISCINA, PIZZERIA, RISTORANTE, SCUOLA, STADIO, STATUA

    };

    public PuntoInteresse (String ID, String descrizione, Orario orarioApertura, Orario orarioChiusura, String tipo, float valutazione, PosizioneSatellitare posizione) {
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


    public float getValutazione () {
        return valutazione;
    }

    public PosizioneSatellitare getPosizione () {
        return posizione;
    }

    public Contenuto caricaContenuto(Contenuto File, String Commento) {
        return null;
    }
    public PuntoInteresse visualizzareContenuti(String id) {
        return null;
    }
}