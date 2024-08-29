package Model;

public class BuilderEvento extends BuilderInformazioneTerritoriale{

    private PosizioneSatellitare luogo;
    private TipoEvento tipo;


    public BuilderEvento() {
        super();
    }

    @Override
    public void reset() {
        this.buildNome("Non identificato");
        this.buildDescrizione("Non dichiarato");
        this.buildTipoEvento(TipoEvento.ALTRO);
        this.buildPosizioneSatellitare(new PosizioneSatellitare(0, 0));
    }



    @Override
    public Evento getResult() {
        Evento evento = new Evento(nome, luogo, descrizione, tipo);
        this.reset();
        return evento;
    }

    public void buildTipoEvento(TipoEvento tipo) {
        this.tipo = tipo;
    }

}
