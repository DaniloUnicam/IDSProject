package Model;

import Abstract.Identificabile;

public class Contest extends Identificabile {

        private final String idContest =getIdIncrementazione();
        private String titolo;
        private String descrizione;
        private String url;
        private String idCreatore;
        private String idContenutoMultimediale;

        public Contest (String titolo, String descrizione, String url,
                        String idCreatore, String idContenutoMultimediale){
            this.titolo = titolo;
            this.descrizione = descrizione;
            this.url = url;
            this.idCreatore = idCreatore;
            this.idContenutoMultimediale = idContenutoMultimediale;
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

        public String getIdContenutoMultimediale() {
            return idContenutoMultimediale;
        }

        public boolean aggiuntaIscrizione(Utente utente) {
            return !utente.getRuolo().equals("Turista_Non_Autenticato");
        }

}
