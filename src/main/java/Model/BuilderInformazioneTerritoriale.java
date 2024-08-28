package Model;

import static Abstract.Identificabile.getIdIncrementazione;

public abstract class BuilderInformazioneTerritoriale {

    private String nome;
    private final String id =getIdIncrementazione();
    private String descrizione;
    private TipoStruttura tipo;
    private PosizioneSatellitare posizione;


    public abstract void reset();
    public abstract BuilderInformazioneTerritoriale getResult();

}
