package it.cs.unicam.app_Comune.Builder;

import it.cs.unicam.app_Comune.Dtos.inputFormat.PuntoInteresseInputFormat;
import it.cs.unicam.app_Comune.Model.Orario;
import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoPuntoInteresse;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import static it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoPuntoInteresse.ALTRO;
@Component
public class BuilderPuntoInteresse extends BuilderInformazioneTerritoriale {

    protected PosizioneSatellitare posizione;
    private Orario orarioApertura;
    private Orario orarioChiusura;
    private double valutazione;
    private TipoPuntoInteresse tipoPuntoInteresse;


    public void buildPosizioneSatellitare(PosizioneSatellitare posizione){
        this.posizione=posizione;
    }


    @Override
    public void reset() {
        this.buildNome("Non identificato");
        this.buildDescrizione("Non dichiarato");
        this.buildPosizioneSatellitare(new PosizioneSatellitare(0, 0));
        this.buildOrarioApertura(new Orario(0, 0));
        this.buildOrarioChiusura(new Orario(0, 0));
        this.buildTipoPuntoInteresse(ALTRO);
        this.buildValutazione(0.0f);
    }

    @Override
    public PuntoInteresse getResult() {
        PuntoInteresse puntoInteresse =
                new PuntoInteresse(nome, descrizione, posizione, orarioApertura, orarioChiusura, tipoPuntoInteresse, valutazione);
        this.reset();
        return puntoInteresse;
    }

    public void buildOrarioApertura(Orario orarioApertura) {
        this.orarioApertura = orarioApertura;
    }

    public void buildOrarioChiusura(Orario orarioChiusura) {
        this.orarioChiusura = orarioChiusura;
    }

    public void buildValutazione(double valutazione) {
        this.valutazione = valutazione;
    }

    public void buildTipoPuntoInteresse(TipoPuntoInteresse tipoPuntoInteresse) {
        this.tipoPuntoInteresse = tipoPuntoInteresse;
    }

}
