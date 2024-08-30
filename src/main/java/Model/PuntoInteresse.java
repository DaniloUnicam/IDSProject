package Model;

import java.util.ArrayList;
import java.util.List;

public class PuntoInteresse extends InformazioneTerritoriale  {

    private final String idPuntoInteresse =getIdIncrementazione();
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private TipoStruttura tipo;
    private float valutazione;
    private PosizioneSatellitare posizione;
    private List <Contenuto> contenuti= new ArrayList<>();

    public PuntoInteresse (String nome,String descrizione, Orario orarioApertura, Orario orarioChiusura, TipoStruttura tipo, float valutazione, PosizioneSatellitare posizione) {
        super(nome,descrizione);
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
        this.valutazione = valutazione;
        this.posizione = posizione;
    }
    public void aggiungiValutazione(float valutazione) {
        this.valutazione = (this.valutazione + valutazione) / 2;
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

    public PuntoInteresse visualizzareContenuto(String id) {
        for (Contenuto contenuto : contenuti) {
            if (contenuto.getID().equals(id)) {
                return this;
            }
        }
        return null;
    }

    public String getID () {
        return idPuntoInteresse;
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


    public List<Contenuto> getContenuti() {
        return contenuti;
    }

}
