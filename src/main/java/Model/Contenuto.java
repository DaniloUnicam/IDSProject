package Model;

import Interfacce.Identificabile;

public class Contenuto extends Identificabile {
    private ContenutoMultimediale file;
    private String Commento;
    private final String id =getIdIncrementazione();

    Contenuto (ContenutoMultimediale file, String commento) {
        this.file = file;
        this.Commento = Commento;
    }
    Contenuto (ContenutoMultimediale file) {
        this.file = file;
    }
    Contenuto (String commento) {
        this.Commento = Commento;
    }

    @Override
    public String getID() {
        return id;
    }


}
