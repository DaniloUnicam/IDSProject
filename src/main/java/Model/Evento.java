package Model;

import Interfacce.Identificabile;

public class Evento extends Identificabile {
    private String nome;
    private String luogo;
    private String descrizione;
    private String id;

    public Evento(String nome, String luogo, String descrizione) {
        this.nome = nome;
        this.luogo = luogo;
        this.descrizione = descrizione;
        this.id = getIdIncrementazione();
    }

    public String getNome() {
        return nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getID() {
        return id;
    }
}
