package InformazioneTerritoriale;

import Abstract.Identificabile;
import Model.Posizionabile;
import Model.PosizioneSatellitare;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe astratta che rappresenta un'informazione territoriale
 * Un'informazione territoriale è un'entità che ha un nome, una descrizione e una posizione satellitare
 * Quindi può rappresentare un evento, un punto di interesse, un contest, ecc...
 */

@Entity
@NoArgsConstructor(force = true)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_informazione_territoriale", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
public abstract class InformazioneTerritoriale extends Identificabile implements Posizionabile {

        private String nome;
        private String descrizione;
        //id univoco dell'informazione territoriale
        @Id
        private final String idInformazioneTerritoriale = getIdIncrementazione();
        //posizione satellitare dell'informazione territoriale

        @Embedded
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

        public PosizioneSatellitare getPosizione() {
            return posizioneSatellitare;
        }

        public String getTipoInformazioneTerritoriale(TipoInformazioneTerritoriale tipologia) {
        switch (tipologia) {
            case PUNTO_INTERESSE:
                return "Punto Interesse";
            case EVENTO:
                return "Evento";
            case ITINERARIO:
                return "Itinerario";
            default:
                return "Informazione Territoriale";
        }
    }
}