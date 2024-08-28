package Model;

import Abstract.Identificabile;

import java.util.ArrayList;
import java.util.List;

public class PuntoInteresse extends Identificabile  {

    private String nome;//
    private final String id =getIdIncrementazione();//
    private String descrizione;//
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private TipoStruttura tipo;//
    private float valutazione;
    private PosizioneSatellitare posizione;//
    private List <Contenuto> contenuti= new ArrayList<>();

    public PuntoInteresse (String descrizione, Orario orarioApertura, Orario orarioChiusura, TipoStruttura tipo, float valutazione, PosizioneSatellitare posizione) {
        this.descrizione = descrizione;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
        this.valutazione = valutazione;
        this.posizione = posizione;
    }
    public String getID () {
        return id;
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

    public void caricaContenuto(ContenutoMultimediale file, String commento) {
        Contenuto contenuto = new Contenuto (file, commento);
        contenuti.add(contenuto);
    }
    public void caricaContenuto(ContenutoMultimediale file) {
        Contenuto contenuto = new Contenuto (file);
        contenuti.add(contenuto);
    }
    public void caricaContenuto(String commento) {
        Contenuto contenuto = new Contenuto (commento);
        contenuti.add(contenuto);
    }

    public PuntoInteresse visualizzareContenuto(String id) { //DA CONTROLLARE
        for (Contenuto contenuto : contenuti) {
            if (contenuto.getID().equals(id)) {
                return this;
            }
        }
        return null;
    }

    /*public Recensione commentaRecensione(Recensione recensione){

    }*/




}
