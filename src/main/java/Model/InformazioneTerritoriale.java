package Model;

import Abstract.Identificabile;


public abstract class InformazioneTerritoriale extends Identificabile {

        private String nome;
        private String descrizione;
        private final String idInformazioneTerritoriale = getIdIncrementazione();

        public InformazioneTerritoriale(String nome, String descrizione) {
            this.nome = nome;
            this.descrizione = descrizione;
        }

        public String getNome() {
            return nome;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public String getID() {
            return idInformazioneTerritoriale;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

}