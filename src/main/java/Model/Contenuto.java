package Model;

import Abstract.Identificabile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor(force = true)
public class Contenuto extends Identificabile {

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contenutoMultimediale_id")
    private ContenutoMultimediale file;


    private String commento;


    //id univoco per ogni contenuto
    @Id
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
