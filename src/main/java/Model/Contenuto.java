package Model;

import Abstract.Identificabile;

public class Contenuto extends Identificabile {
    private ContenutoMultimediale file;
    private String commento;
    //id univoco per ogni contenuto
    private final String idContenuto =getIdIncrementazione();

    public Contenuto (ContenutoMultimediale file, String commento) {
        this.file = file;
        this.commento = commento;
    }
    public Contenuto (ContenutoMultimediale file) {
        this.file = file;
    }
    public Contenuto (String commento) {
        this.commento = commento;
    }

    @Override
    public String getID() {
        return idContenuto;
    }

    public String getUrl(){
        return file.getUrl();
    }

    public String getCommento(){
        return commento;
    }


}
