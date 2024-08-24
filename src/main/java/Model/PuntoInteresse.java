package Model;

import Interfacce.Identificabile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PuntoInteresse implements Identificabile {

    private String nome;
    private final String ID;
    private String descrizione;
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private TipoStruttura tipo;
    private float valutazione;
    private PosizioneSatellitare posizione;
    private List <Contenuto> contenuti= new ArrayList<>();
    private List<PuntoInteresse> puntoInteresse = new ArrayList<>();

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


    public void caricaContenuto(File file, String Commento) {
        puntoInteresse.add(contenuti);
    }

    public PuntoInteresse visualizzareContenuti(String id) {
        return null;
    }

    public Recensione commentaRecensione(Recensione recensione){

    }

}
