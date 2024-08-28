package Model;

import Abstract.Identificabile;

public class Evento extends Identificabile {
    private String nome;
    //invece di queso mettiamo POSIZIONE
    // private String luogo;
    private String descrizione;
    private TipoEvento tipo;
    private PosizioneSatellitare posizione;
    private String id=getIdIncrementazione();

    public Evento(String nome, String descrizione, TipoEvento tipo, PosizioneSatellitare posizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.posizione = posizione;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
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
