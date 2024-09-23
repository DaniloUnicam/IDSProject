package Model;

import Abstract.Identificabile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor // Crea un costruttore vuoto
public class Contest extends Identificabile {

        @Id
        //id univoco per ogni contest
        private final String idContest =getIdIncrementazione();

        private String titolo;
        private String descrizione;
        private String url;

        @ManyToOne (fetch = FetchType.EAGER)
        private Utente creatore;

        /**
         * Lista dei contenuti nel contest
         */
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(
                name = "Contest_Contenuto",
                joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "idContest"),
                inverseJoinColumns = @JoinColumn(name = "POI_id", referencedColumnName = "idPuntoInteresse"))
        private List<Contenuto> contenuti = new ArrayList<>();

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
        }

        public String getID() {
            return idContest;
        }

        public boolean aggiuntaIscrizione(Utente utente) {
            return !utente.getRuolo().equals("Turista_Non_Autenticato");
        }

        public void iscriviUtente(Utente utente) {
            if(aggiuntaIscrizione(utente))
                this.iscritti.add(utente);
        }

}
