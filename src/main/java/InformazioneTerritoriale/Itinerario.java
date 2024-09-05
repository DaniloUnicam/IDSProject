package InformazioneTerritoriale;

import Model.Posizionabile;
import Model.PosizioneSatellitare;

import java.util.List;

public class Itinerario extends InformazioneTerritoriale {

    protected String nome;
    protected String descrizione;
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
