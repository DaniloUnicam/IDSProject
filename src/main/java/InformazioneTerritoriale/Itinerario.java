package InformazioneTerritoriale;

import Model.Posizionabile;
import Model.PosizioneSatellitare;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("ITINERARIO ")
public class Itinerario extends InformazioneTerritoriale {

    protected String nome;
    protected String descrizione;
    private List<PuntoInteresse> listaPuntiInteresse;
    //id univoco per ogni itinerario
    private static final String idItinerario = getIdIncrementazione();

    public Itinerario(String nome, String descrizione, List<PuntoInteresse> listaPuntiInteresse) {
        super(nome, descrizione);
        this.listaPuntiInteresse = listaPuntiInteresse;
    }

    public List<PuntoInteresse> getListaPuntiInteresse() {
        return listaPuntiInteresse;
    }

}
