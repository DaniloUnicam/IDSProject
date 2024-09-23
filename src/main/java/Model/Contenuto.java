package Model;

import Abstract.Identificabile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor(force = true)
@Getter
@Setter
public class Contenuto extends Identificabile {

    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(
            name = "contenuto_contenutoMultimediale",
            joinColumns = @JoinColumn(name = "contenuto_id", referencedColumnName = "idContenuto"),
            inverseJoinColumns = @JoinColumn(name = "contenutoMultimediale_id", referencedColumnName = "id"))
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
}
