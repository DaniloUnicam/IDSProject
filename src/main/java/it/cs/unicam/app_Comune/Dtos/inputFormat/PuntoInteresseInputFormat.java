package it.cs.unicam.app_Comune.Dtos.inputFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoPuntoInteresse;
import it.cs.unicam.app_Comune.Model.Orario;
import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;
import lombok.Getter;

import java.util.Objects;

@Schema(description = "Punto di interesse")
@Getter
public class PuntoInteresseInputFormat {
    @Schema(description = "Nome del punto di interesse", example = "Ristorante San Fabiano")
    private String nome;
    @Schema(description = "Descrizione del punto di interesse", example = "Ristorante situato nelle campagne di San Ginesio")
    private String descrizione;
    //scrivere l'ora come 0:0, non 00:00
    @Schema(description = "Orario di apertura del punto di interesse")
    private Orario orarioApertura;
    //scrivere l'ora come 0:0, non 00:00
    @Schema(description = "Orario di chiusura del punto di interesse")
    private Orario orarioChiusura;
    @Schema(description = "Tipo di punto di interesse", example = "RISTORANTE")
    private TipoPuntoInteresse tipo;
    @Schema(description = "Valutazione del punto di interesse", example = "5")
    private double valutazione;
    @Schema(description = "Posizione satellitare del punto di interesse", example = "43.1038732,13.2924709")
    private PosizioneSatellitare posizioneSatellitareInputFormat;


    public PuntoInteresseInputFormat(String nome, String descrizione, PosizioneSatellitare posizioneSatellitareinputFormat, Orario orarioApertura, Orario orarioChiusura,
                                     TipoPuntoInteresse tipo, double valutazione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.posizioneSatellitareInputFormat = posizioneSatellitareinputFormat;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.tipo = tipo;
        this.valutazione = valutazione;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (PuntoInteresseInputFormat) obj;
        return Objects.equals(this.nome, that.nome) &&
                Objects.equals(this.descrizione, that.descrizione) &&
                Objects.equals(this.orarioApertura, that.orarioApertura) &&
                Objects.equals(this.orarioChiusura, that.orarioChiusura) &&
                Objects.equals(this.tipo, that.tipo) &&
                Objects.equals(this.valutazione, that.valutazione) &&
                Objects.equals(this.posizioneSatellitareInputFormat, that.posizioneSatellitareInputFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descrizione, orarioApertura, orarioChiusura, tipo, valutazione, posizioneSatellitareInputFormat);
    }

    @Override
    public String toString() {
        return "PuntoInteresseInputFormat[" +
                "nome=" + nome + ", " +
                "descrizione=" + descrizione + ", " +
                "orarioApertura=" + orarioApertura + ", " +
                "orarioChiusura=" + orarioChiusura + ", " +
                "tipo=" + tipo + ", " +
                "valutazione=" + valutazione + ", " +
                "posizione=" + posizioneSatellitareInputFormat + ']';
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Orario getOrarioApertura() {
        return orarioApertura;
    }

    public Orario getOrarioChiusura() {
        return orarioChiusura;
    }

    public TipoPuntoInteresse getTipo() {
        return tipo;
    }

    public double getValutazione() {
        return valutazione;
    }

    public PosizioneSatellitare getPosizioneSatellitareInputFormat() {
        return posizioneSatellitareInputFormat;
    }
}


