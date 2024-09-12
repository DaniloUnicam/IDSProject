package InformazioneTerritoriale;

import Abstract.Identificabile;
import Model.Posizionabile;
import Model.PosizioneSatellitare;

/**
 * Classe astratta che rappresenta un'informazione territoriale
 * Un'informazione territoriale è un'entità che ha un nome, una descrizione e una posizione satellitare
 * Quindi può rappresentare un evento, un punto di interesse, un contest, ecc...
 */
public abstract class InformazioneTerritoriale extends Identificabile implements Posizionabile {

        private String nome;
        private String descrizione;
        //id univoco dell'informazione territoriale
        private final String idInformazioneTerritoriale = getIdIncrementazione();
        //posizione satellitare dell'informazione territoriale
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