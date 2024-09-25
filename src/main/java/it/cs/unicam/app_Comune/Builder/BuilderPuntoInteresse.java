package it.cs.unicam.app_Comune.Builder;

import it.cs.unicam.app_Comune.Model.Orario;
import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoStruttura;

import static it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoStruttura.ALTRO;

public class BuilderPuntoInteresse extends BuilderInformazioneTerritoriale {

    private Orario orarioApertura;
    private Orario orarioChiusura;
    private float valutazione;

    protected PosizioneSatellitare posizione;
    private TipoStruttura tipoStruttura;

    public BuilderPuntoInteresse() {
        super();
    }

    public void buildPosizioneSatellitare(PosizioneSatellitare posizione){
        this.posizione=posizione;
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

    public PuntoInteresse getResult(PuntoInteresse poi) {
        PuntoInteresse puntoInteresse = poi;
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
