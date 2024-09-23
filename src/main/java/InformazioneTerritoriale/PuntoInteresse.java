package InformazioneTerritoriale;

import Model.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("POI")
@Getter
@Setter
public class PuntoInteresse extends InformazioneTerritoriale {

    @Id
    //id univoco per ogni punto di interesse
    private final String idPuntoInteresse =getIdIncrementazione();

    @Embedded
    private Orario orarioApertura;

    @Embedded
    private Orario orarioChiusura;
    //Tipo di struttura del punto di interesse

    @Enumerated(EnumType.STRING)
    private TipoStruttura tipo;
    //Valutazione media del punto di interesse @range 0-5


    private float valutazione;


    @OneToMany(fetch = FetchType.EAGER)
    private List <Contenuto> contenuti= new ArrayList<>();
    //Variabile per calcolare la media delle valutazioni

    private int counterValutazione = 0;


    //Costruttore per un punto di interesse senza valutazione
    public PuntoInteresse (String nome,String descrizione, Orario orarioApertura, Orario orarioChiusura, TipoStruttura tipo, PosizioneSatellitare posizione) {
        super(nome,descrizione,posizione);
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
    }

    //Costruttore per un punto di interesse con valutazione
    public PuntoInteresse (String nome,String descrizione, Orario orarioApertura, Orario orarioChiusura, TipoStruttura tipo, float valutazione, PosizioneSatellitare posizione) {
        super(nome,descrizione,posizione);
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
        this.valutazione = valutazione;
    }

    /**
     * Aggiunge una valutazione al punto di interesse
     * @param valutazione valutazione da aggiungere
     */
    public void aggiungiValutazione(float valutazione) {
        this.valutazione = (valutazione + this.valutazione*(counterValutazione++)) / counterValutazione;
    }

    //Metodo per caricare un contenuto multimediale con un commento
    public void caricaContenuto(ContenutoMultimediale file, String commento) {
        Contenuto contenuto = new Contenuto (file, commento);
        contenuti.add(contenuto);
    }

    //Metodo per caricare un contenuto multimediale
    public void caricaContenuto(ContenutoMultimediale file) {
        Contenuto contenuto = new Contenuto (file);
        contenuti.add(contenuto);
    }

    //Metodo per caricare un contenuto testuale
    public void caricaContenuto(String commento) {
        Contenuto contenuto = new Contenuto (commento);
        contenuti.add(contenuto);
    }

    //Metodo per rimuovere un contenuto da un punto di interesse
    public void rimuoviContenuto(String idContenuto) {
        for (Contenuto contenuto : contenuti) {
            if (contenuto.getID().equals(idContenuto)) {
                contenuti.remove(contenuto);
                return;
            }
        }
    }

    //Metodo per visualizzare il contenuto di un punto di interesse
    public Contenuto visualizzareContenuto(String idContenuto) {
        for (Contenuto contenuto : contenuti) {
            if (contenuto.getID().equals(idContenuto)) {
                return contenuto;
            }
        }
        return null;
    }

    @Override
    public String getID() {
        return idPuntoInteresse;
    }

    @Override
    public PosizioneSatellitare getPosizione() {
        return null;
    }
}
