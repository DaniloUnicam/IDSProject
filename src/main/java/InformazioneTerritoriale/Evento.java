package InformazioneTerritoriale;

import Model.Posizionabile;
import Model.PosizioneSatellitare;

public class Evento extends InformazioneTerritoriale {

    private String nome;
    private PosizioneSatellitare luogo;
    private String descrizione;
    //id univoco per ogni evento
    private String idEvento = getIdIncrementazione();
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
        return idEvento;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

}
