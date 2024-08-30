package Model;

public class BuilderEvento extends BuilderInformazioneTerritoriale{


    private TipoEvento tipoEvento;


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
        Evento evento = new Evento(nome, posizione, descrizione, tipoEvento);
        this.reset();
        return evento;
    }

    public void buildTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}
