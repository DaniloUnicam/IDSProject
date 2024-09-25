package it.cs.unicam.app_Comune.InformazioneTerritoriale;

import it.cs.unicam.app_Comune.Model.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("PUNTOINTERESSE")
@Getter
@Setter
public class PuntoInteresse extends InformazioneTerritoriale {

    @Embedded
    private Orario orarioApertura;

    @Embedded
    private Orario orarioChiusura;
    //Tipo di struttura del punto di interesse

    @Enumerated(EnumType.STRING)
    private TipoPuntoInteresse tipoPuntoInteresse;

    //Valutazione media del punto di interesse @range 0-5
    private float valutazione;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "PuntoInteresse_Contenuto",
            joinColumns = @JoinColumn(name = "POI_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "contenuto_ID", referencedColumnName = "idContenuto"))
    private List <Contenuto> contenuti= new ArrayList<>();
    //Variabile per calcolare la media delle valutazioni

    private int counterValutazione;

    //Costruttore per un punto di interesse con valutazione
    public PuntoInteresse (String nome, String descrizione, Orario orarioApertura, Orario orarioChiusura,
                           TipoPuntoInteresse tipo, float valutazione, PosizioneSatellitare posizione) {
        super(nome,descrizione,posizione);
        this.tipoPuntoInteresse = tipo;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.valutazione = valutazione;
        counterValutazione = 0;
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
    public void rimuoviContenuto(long idContenuto) {
        for (Contenuto contenuto : contenuti) {
            if (contenuto.getID()== (idContenuto)) {
                contenuti.remove(contenuto);
                return;
            }
        }
    }

    //Metodo per visualizzare il contenuto di un punto di interesse
    public Contenuto visualizzareContenuto(long idContenuto) {
        for (Contenuto contenuto : contenuti) {
            if (contenuto.getID() == (idContenuto)) {
                return contenuto;
            }
        }
        return null;
    }

    @Override
    public long getID() {
        return super.getID();
    }

    @Override
    public PosizioneSatellitare getPosizione() {
        return super.getPosizione();
    }
}
