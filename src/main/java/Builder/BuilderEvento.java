package Builder;

import Model.PosizioneSatellitare;
import InformazioneTerritoriale.Evento;
import InformazioneTerritoriale.TipoEvento;
/**
 * Builder per la creazione di un evento
 */
public class BuilderEvento extends BuilderInformazioneTerritoriale{


    private TipoEvento tipoEvento;
    protected PosizioneSatellitare posizione;


    public BuilderEvento() {
        super();
    }

    public void buildPosizioneSatellitare(PosizioneSatellitare posizione){
        this.posizione=posizione;
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
