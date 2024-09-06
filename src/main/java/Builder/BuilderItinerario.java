package Builder;

import InformazioneTerritoriale.Itinerario;
import InformazioneTerritoriale.PuntoInteresse;

import java.util.ArrayList;
import java.util.List;

public class BuilderItinerario extends BuilderInformazioneTerritoriale {

    private List<PuntoInteresse> listaPuntiInteresse;

    public BuilderItinerario() {
            super();
    }

    public void reset() {
        this.buildNome("Non identificato");
        this.buildDescrizione("Non dichiarato");
        this.buildListaPuntiInteresse(new ArrayList<>());
    }

    public Itinerario getResult() {
        Itinerario itinerario = new Itinerario(nome, descrizione, listaPuntiInteresse);
        this.reset();
        return itinerario;
    }

    public void buildListaPuntiInteresse(List<PuntoInteresse> listaPuntiInteresse) {
        this.listaPuntiInteresse = listaPuntiInteresse;
    }
}
