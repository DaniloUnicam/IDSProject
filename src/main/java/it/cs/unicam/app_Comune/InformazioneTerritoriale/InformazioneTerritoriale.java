package it.cs.unicam.app_Comune.InformazioneTerritoriale;

import it.cs.unicam.app_Comune.Abstract.Identificabile;
import it.cs.unicam.app_Comune.Model.Posizionabile;
import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;
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
@DiscriminatorColumn(name = "TIPOLOGIAINFORMAZIONETERRITORIALE")
@DiscriminatorValue("INFORMAZIONETERRITORIALE")
@Getter
@Setter
public abstract class InformazioneTerritoriale  implements Posizionabile,Identificabile {

        private String nome;

        private String descrizione;
        //id univoco dell'informazione territoriale
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idInformazioneTerritoriale;

        //posizione satellitare dell'informazione territoriale
        @Embedded
        private PosizioneSatellitare posizioneSatellitare;

        @Enumerated(EnumType.STRING)
        TipoInformazioneTerritoriale tipologia;

        @Enumerated(EnumType.STRING)
        TipoStruttura tipoStruttura;

        public InformazioneTerritoriale(String nome, String descrizione) {
            this.nome = nome;
            this.descrizione = descrizione;
        }

        public InformazioneTerritoriale(String nome, String descrizione, PosizioneSatellitare posizioneSatellitare, TipoStruttura tipo) {
            this.nome = nome;
            this.descrizione = descrizione;
            this.posizioneSatellitare = posizioneSatellitare;
            this.tipoStruttura = tipo;
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

    @Override
    public long getID() {
        return idInformazioneTerritoriale;
    }
}