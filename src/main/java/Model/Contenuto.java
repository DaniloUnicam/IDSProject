package Model;

public class Contenuto  {
    private ContenutoMultimediale file;
    private String Commento;
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
}
