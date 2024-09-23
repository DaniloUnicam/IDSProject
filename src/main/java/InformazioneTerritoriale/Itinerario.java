package InformazioneTerritoriale;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("ITINERARIO ")
@Getter
@Setter
public class Itinerario extends InformazioneTerritoriale {

    //id univoco per ogni itinerario
    @Id
    private static final String idItinerario = getIdIncrementazione();

    protected String nome;

    protected String descrizione;

    @OneToMany(fetch = FetchType.EAGER)
    private List<PuntoInteresse> listaPuntiInteresse;


    public Itinerario(String nome, String descrizione, List<PuntoInteresse> listaPuntiInteresse) {
        super(nome, descrizione);
        this.listaPuntiInteresse = listaPuntiInteresse;
    }

    public List<PuntoInteresse> getListaPuntiInteresse() {
        return listaPuntiInteresse;
    }

}
