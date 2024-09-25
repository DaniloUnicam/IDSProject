package it.cs.unicam.app_Comune.Model;

import it.cs.unicam.app_Comune.Abstract.Identificabile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor(force = true)
@Getter
@Setter
public class Contenuto implements Identificabile {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(
            name = "contenuto_contenutoMultimediale",
            joinColumns = @JoinColumn(name = "contenuto_id", referencedColumnName = "idContenuto"),
            inverseJoinColumns = @JoinColumn(name = "contenutoMultimediale_id", referencedColumnName = "idContenutoMultimediale"))
    private ContenutoMultimediale file;

    private String commento;

    //id univoco per ogni contenuto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContenuto;

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
    public long getID() {
        return idContenuto;
    }

    public String getUrl() {
        return file.getUrl();
    }
}
