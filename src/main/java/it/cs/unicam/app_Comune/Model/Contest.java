package it.cs.unicam.app_Comune.Model;

import it.cs.unicam.app_Comune.Abstract.Identificabile;
import it.cs.unicam.app_Comune.Abstract.Valutazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor // Crea un costruttore vuoto
public class Contest implements Identificabile, Valutazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id univoco per ogni contest
    private long idContest;

    private String titolo;
    private String descrizione;
    private String url;
    /*
        //Valutazione media del contest @range 0-5
        private float valutazione;

        //quantità di valutazioni effettuate
        private int counterValutazione;

        @OneToOne
        private Contenuto contenuti;

        Contenitore delle valutazioni effettuate associate agli id dei contenuti
        @ElementCollection
        @JoinTable(
                name = "Contest_Valutazione",
                joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "idContest"),
                inverseJoinColumns = @JoinColumn(name = "valutazione_id", referencedColumnName = "idValutazione"))
        private HashMap<Float,> listaValutazioni = new HashMap<>();
        */
    @ManyToOne (fetch = FetchType.EAGER)
    private Utente creatore;

    /**
     * Lista dei contenuti nel contest
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Contest_Contenuto",
            joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "idContest"),
            inverseJoinColumns = @JoinColumn(name = "contenuto_id", referencedColumnName = "idContenuto"))
    private List<Contenuto> contenuto = new ArrayList<>();

    /**
     * Lista degli utenti iscritti al contest
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Contest_Utente",
            joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "idContest"),
            inverseJoinColumns = @JoinColumn(name = "utente_id", referencedColumnName = "idUtente"))
    private List<Utente> iscritti = new ArrayList<>();


    public Contest (String titolo, String descrizione, String url,
                    Utente creatore){
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.url = url;
        this.creatore = creatore;
        //this.valutazione = 0;
        //this.counterValutazione = 0;
        //this.listaValutazioni = new HashMap<>();
    }

    public long getID() {
        return idContest;
    }

    public boolean aggiuntaIscrizione(Utente utente) {
        return !utente.getRuolo().equals("Turista_Non_Autenticato");
    }

    public void iscriviUtente(Utente utente) {
        if(aggiuntaIscrizione(utente))
            this.iscritti.add(utente);
    }

    /*
    public void aggiungiValutazione(float valutazione, Long idContenuto) {
        if(valutazione < 1 || valutazione > 5) throw new IllegalArgumentException("Valutazione non valida");
        this.listaValutazioni.put(valutazione, idContenuto);
        this.valutazione = (valutazione + this.valutazione*(counterValutazione++)) / counterValutazione;
    }

     */
}