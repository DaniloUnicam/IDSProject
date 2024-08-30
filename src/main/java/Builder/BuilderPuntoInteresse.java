package Builder;

import Model.Orario;
import Model.PosizioneSatellitare;
import Model.PuntoInteresse;
import Model.TipoStruttura;

import static Model.TipoStruttura.ALTRO;

public class BuilderPuntoInteresse extends BuilderInformazioneTerritoriale {

    private Orario orarioApertura;
    private Orario orarioChiusura;
    private float valutazione;

    private TipoStruttura tipoStruttura;

    public BuilderPuntoInteresse() {
        super();
    }


    @Override
    public void reset() {
        this.buildNome("Non identificato");
        this.buildDescrizione("Non dichiarato");
        this.buildTipoStruttura(ALTRO);
        this.buildPosizioneSatellitare(new PosizioneSatellitare(0, 0));
        this.buildOrarioApertura(new Orario(0, 0));
        this.buildOrarioChiusura(new Orario(0, 0));
        this.buildValutazione(0);
    }

    @Override
    public PuntoInteresse getResult() {
        PuntoInteresse puntoInteresse = new PuntoInteresse(nome, descrizione, orarioApertura, orarioChiusura, tipoStruttura, valutazione, posizione);
        this.reset();
        return puntoInteresse;
    }

    public void buildOrarioApertura(Orario orarioApertura) {
        this.orarioApertura = orarioApertura;
    }

    public void buildOrarioChiusura(Orario orarioChiusura) {
        this.orarioChiusura = orarioChiusura;
    }

    public void buildValutazione(float valutazione) {
        this.valutazione = valutazione;
    }

    public void buildTipoStruttura(TipoStruttura tipoStruttura) {
        this.tipoStruttura = tipoStruttura;
    }

}
