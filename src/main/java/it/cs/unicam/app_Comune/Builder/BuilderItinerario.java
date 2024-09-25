package it.cs.unicam.app_Comune.Builder;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.Itinerario;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;

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
        Itinerario itinerario = new Itinerario(nome, descrizione, tipologiaItinerario, listaPuntiInteresse);
        this.reset();
        return itinerario;
    }

    public void buildListaPuntiInteresse(List<PuntoInteresse> listaPuntiInteresse) {
        this.listaPuntiInteresse = listaPuntiInteresse;
    }
}
