package Model;

import Abstract.Identificabile;

public class Evento extends InformazioneTerritoriale {

    private String nome;
    private PosizioneSatellitare luogo;
    private String descrizione;
    private String id = getIdIncrementazione();
    private TipoEvento tipo;

    public Evento(String nome, PosizioneSatellitare luogo, String descrizione, TipoEvento tipo) {
        super(nome, descrizione);
        this.nome = nome;
        this.luogo = luogo;
        this.descrizione = descrizione;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public PosizioneSatellitare getLuogo() {
        return luogo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getID() {
        return id;
    }

    public TipoEvento getTipo() {
        return tipo;
    }
}
