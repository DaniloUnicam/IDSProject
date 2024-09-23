package Model;

import Abstract.Identificabile;
import InformazioneTerritoriale.TipoContest;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;
import jakarta.persistence.DiscriminatorValue;

import java.util.List;


@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("CONTEST")
public class Contest extends Identificabile {

        @Id
        //id univoco per ogni contest
        private final String idContest =getIdIncrementazione();
        private String titolo;
        private String descrizione;
        private String url;
        private String idCreatore;
        @OneToMany
        private List<ContenutoMultimediale> contenutiContest;
        private TipoContest tipo;

        public Contest (String titolo, String descrizione, String url,
                        String idCreatore, List<ContenutoMultimediale> contenutiContest, TipoContest tipo) {
            this.titolo = titolo;
            this.descrizione = descrizione;
            this.url = url;
            this.idCreatore = idCreatore;
            this.contenutiContest = contenutiContest;
            this.tipo = tipo;
        }



    public String getTitolo() {
            return titolo;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public String getUrl() {
            return url;
        }

        public String getID() {
            return idContest;
        }

        public String getIdCreatore() {
            return idCreatore;
        }

        public List<ContenutoMultimediale> getContenutiContest() {
            return contenutiContest;
        }

        public boolean aggiuntaIscrizione(Utente utente) {
            return !utente.getRuolo().equals("Turista_Non_Autenticato");
        }

}
