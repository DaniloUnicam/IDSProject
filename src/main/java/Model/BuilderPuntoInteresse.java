package Model;

import java.util.ArrayList;
import java.util.List;

import static Abstract.Identificabile.getIdIncrementazione; //giusto?
import static Model.TipoStruttura.ALTRO;

public class BuilderPuntoInteresse extends BuilderInformazioneTerritoriale{

    private Orario orarioApertura;
    private Orario orarioChiusura;
    private float valutazione;
    private List<Contenuto> contenuti= new ArrayList<>();


    public BuilderPuntoInteresse() {
        super();
    }


    @Override
    public void reset() {
        defaultInformazioneTerritoriale();
    }


    @Override
    public BuilderPuntoInteresse getResult() {
        PuntoInteresse puntoInteresse = new PuntoInteresse(nome,descrizione,orarioApertura,orarioChiusura,tipo,valutazione,posizione);
        puntoInteresse.setContenuti(contenuti);
        this.reset();
        return ;
    }

    public void buildOrarioApertura(Orario orarioApertura){
        this.orarioApertura=orarioApertura;
    }

    public void buildOrarioChiusura(Orario orarioChiusura){
        this.orarioChiusura=orarioChiusura;
    }
    public void buildValutazione(float valutazione){
        this.valutazione=valutazione;
    }
    public void buildContenuti(List<Contenuto> contenuti){
        this.contenuti=contenuti;
    }

    private void defaultInformazioneTerritoriale(){
        this.buildNome("Non identificato");
        this.buildDescrizione("Non Dichiarato");
        this.buildTipo(ALTRO);
        this.buildPosizione(new PosizioneSatellitare(0,0));
        this.buildOrarioApertura(new Orario(0,0));
        this.buildOrarioChiusura(new Orario(0,0));
        this.buildValutazione(0);
        this.buildContenuti(new ArrayList<>());
    }


}
