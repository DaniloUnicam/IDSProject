package Model;

import static Abstract.Identificabile.getIdIncrementazione;

public abstract class BuilderInformazioneTerritoriale {

    protected String nome;
    protected String descrizione;
    protected TipoStruttura tipo;
    protected PosizioneSatellitare posizione;

        public abstract void reset();
    public void buildNome(String nome){
        this.nome=nome;
    }
    public void buildDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    public void buildTipo(TipoStruttura tipo){
        this.tipo=tipo;
    }
    public void buildPosizione(PosizioneSatellitare posizione){
        this.posizione=posizione;
    }

    public abstract InformazioneTerritoriale getResult();


}
