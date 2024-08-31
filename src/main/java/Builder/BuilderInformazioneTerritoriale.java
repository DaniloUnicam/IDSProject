package Builder;

import Model.InformazioneTerritoriale;
import Model.PosizioneSatellitare;

import InformazioneTerritoriale.InformazioneTerritoriale;

public abstract class BuilderInformazioneTerritoriale {

    protected String nome;
    protected String descrizione;
    protected PosizioneSatellitare posizione;

    public abstract void reset();

    public void buildNome(String nome){
        this.nome=nome;
    }
    public void buildDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    public void buildPosizioneSatellitare(PosizioneSatellitare posizione){
        this.posizione=posizione;
    }

    public abstract InformazioneTerritoriale getResult();

}
