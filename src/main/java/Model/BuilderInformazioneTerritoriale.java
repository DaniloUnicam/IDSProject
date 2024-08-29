package Model;

public abstract class BuilderInformazioneTerritoriale {

    protected String nome;
    protected String descrizione;
    protected TipoStruttura tipoStruttura;
    protected TipoEvento tipoEvento;
    protected PosizioneSatellitare posizione;

    public abstract void reset();

    public void buildNome(String nome){
        this.nome=nome;
    }
    public void buildDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    public void buildTipoStruttura(TipoStruttura tipoStruttura){
        this.tipoStruttura = tipoStruttura;
    }

    public  void buildTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    };

    public void buildPosizioneSatellitare(PosizioneSatellitare posizione){
        this.posizione=posizione;
    }

    public abstract InformazioneTerritoriale getResult();

}
