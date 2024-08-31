package InformazioneTerritoriale;

import java.util.List;

public class Itinerario extends InformazioneTerritoriale {

    private List<PuntoInteresse> listaPuntiInteresse;

    private static final String idItinerario = getIdIncrementazione();

    public Itinerario(String nome, String descrizione, List<PuntoInteresse> listaPuntiInteresse) {
        super(nome, descrizione);
        this.listaPuntiInteresse = listaPuntiInteresse;
    }

    public List<PuntoInteresse> getListaPuntiInteresse() {
        return listaPuntiInteresse;
    }

}
