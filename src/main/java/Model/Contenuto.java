package Model;

import Abstract.Identificabile;

public class Contenuto extends Identificabile {
    private ContenutoMultimediale file;
    private String Commento;
    private final String idContenuto =getIdIncrementazione();

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
        return idContenuto;
    }

    public String getUrl(){
        return file.getUrl();
    }


}
