package Model;

import Interfacce.Identificabile;

public class Contest implements Identificabile {

        private String id;
        private String titolo;
        private String descrizione;
        private String url;
        private String idCreatore;
        private String idContenutoMultimediale;

        public Contest (String id, String titolo, String descrizione, String url, String idCreatore, String idContenutoMultimediale) {
            this.id = id;
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
            return id;
        }

        public String getIdCreatore() {
            return idCreatore;
        }

        public String getIdContenutoMultimediale() {
            return idContenutoMultimediale;
        }


}
