package Model;

import Abstract.Identificabile;

public class Evento extends InformazioneTerritoriale {

    private TipoEvento tipo;
    private PosizioneSatellitare posizione;
    private String id=getIdIncrementazione();

    public Evento(String nome, String descrizione,TipoEvento tipo, PosizioneSatellitare posizione) {
        super(nome, descrizione);
        this.tipo = tipo;
        this.posizione = posizione;
    }

    public TipoEvento getTipo() {
        return tipo;
    }
    public PosizioneSatellitare getPosizione() {
        return posizione;
    }
    public String getID() {
        return id;
    }
}
