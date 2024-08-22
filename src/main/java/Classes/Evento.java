package Classes;

public class Evento {
    private String nome;
    private String luogo;
    private String descrizione;
    private PosizioneSatellitare posizione;
    private Orario orarioInizio;
    private Orario orarioFine;

    public Evento(String nome, String luogo, String descrizione, PosizioneSatellitare posizione, Orario orarioInizio, Orario orarioFine) {
        this.nome = nome;
        this.luogo = luogo;
        this.descrizione = descrizione;
        this.posizione = posizione;
        this.orarioInizio = orarioInizio;
        this.orarioFine = orarioFine;
    }
}
