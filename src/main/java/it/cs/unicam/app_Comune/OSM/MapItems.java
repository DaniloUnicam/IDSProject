package it.cs.unicam.app_Comune.OSM;


import it.cs.unicam.app_Comune.InformazioneTerritoriale.Evento;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.Itinerario;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;

import java.util.List;

public class MapItems {

    private final List<PuntoInteresse> puntiInteresse;
    private final List<Evento> eventi;
    private final List<Itinerario> itinerari;
    private final String osmData;

    public MapItems(List<PuntoInteresse> puntiInteresse, List<Evento> eventi, List<Itinerario> itinerari, String osmData) {
        this.puntiInteresse = puntiInteresse;
        this.eventi = eventi;
        this.itinerari = itinerari;
        this.osmData = osmData;
    }


    public List<PuntoInteresse> getPuntiInteresse() {
        return puntiInteresse;
    }

}
