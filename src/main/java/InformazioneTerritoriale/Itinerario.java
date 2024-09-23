package InformazioneTerritoriale;

import Model.Posizionabile;
import Model.PosizioneSatellitare;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("ITINERARIO ")
public class Itinerario extends InformazioneTerritoriale {

    protected String nome;
    protected String descrizione;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Itinerario_PuntoInteresse",
            joinColumns = @JoinColumn(name = "itinerario_ID", referencedColumnName = "idItinerario"),
            inverseJoinColumns = @JoinColumn(name = "POI_ID", referencedColumnName = "idPuntoInteresse"))
    private List<PuntoInteresse> listaPuntiInteresse;

    @Id
    //id univoco per ogni itinerario
    private static final String idItinerario = getIdIncrementazione();

    public Itinerario(String nome, String descrizione, List<PuntoInteresse> listaPuntiInteresse) {
        super(nome, descrizione);
        this.listaPuntiInteresse = listaPuntiInteresse;
    }

    public List<PuntoInteresse> getListaPuntiInteresse() {
        return listaPuntiInteresse;
    }

    @Override
    public String getID() {
        return idItinerario;
    }

}
