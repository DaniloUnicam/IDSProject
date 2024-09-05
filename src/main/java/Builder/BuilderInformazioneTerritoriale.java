package Builder;

import Model.PosizioneSatellitare;

import InformazioneTerritoriale.InformazioneTerritoriale;

public abstract class BuilderInformazioneTerritoriale {

    protected String nome;
    protected String descrizione;


    public abstract void reset();

    public void buildNome(String nome){
        this.nome=nome;
    }
    public void buildDescrizione(String descrizione){
        this.descrizione=descrizione;
    }


    public abstract InformazioneTerritoriale getResult();

}
