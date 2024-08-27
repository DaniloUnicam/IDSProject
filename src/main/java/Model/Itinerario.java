package Model;

import Interfacce.Identificabile;

public class Itinerario extends Identificabile {

    private String nome;
    private String descrizione;
    private String id;

    public Itinerario(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.id = getIdIncrementazione();
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getID() {
        return id;
    }

}
