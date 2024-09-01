package InformazioneTerritoriale;

import Abstract.Identificabile;
import Model.Posizionabile;
import Model.PosizioneSatellitare;


public abstract class InformazioneTerritoriale extends Identificabile implements Posizionabile {

        private String nome;
        private String descrizione;
        private final String idInformazioneTerritoriale = getIdIncrementazione();
        private PosizioneSatellitare posizioneSatellitare;

        public InformazioneTerritoriale(String nome, String descrizione) {
            this.nome = nome;
            this.descrizione = descrizione;
        }

        public InformazioneTerritoriale(String nome, String descrizione, PosizioneSatellitare posizioneSatellitare) {
            this.nome = nome;
            this.descrizione = descrizione;
            this.posizioneSatellitare = posizioneSatellitare;
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

        public PosizioneSatellitare getPosizione() {
            return posizioneSatellitare;
        }

}