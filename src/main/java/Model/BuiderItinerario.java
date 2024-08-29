package Model;

import java.util.ArrayList;
import java.util.List;

public class BuiderItinerario extends BuilderInformazioneTerritoriale {

    private List<PuntoInteresse> listaPuntiInteresse;

    public BuiderItinerario() {
        super();
    }

    @Override
    public void reset() {
        this.buildNome("Non identificato");
        this.buildDescrizione("Non dichiarato");
        this.buildListaPuntiInteresse(new ArrayList<PuntoInteresse>(0));
    }

    @Override
    public Itinerario getResult() {
        Itinerario itinerario = new Itinerario(nome, descrizione, listaPuntiInteresse);
        this.reset();
        return itinerario;
    }

    public void buildListaPuntiInteresse(List<PuntoInteresse> listaPuntiInteresse) {
        this.listaPuntiInteresse = listaPuntiInteresse;
    }


}
