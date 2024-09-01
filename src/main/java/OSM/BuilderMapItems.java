package OSM;

import InformazioneTerritoriale.Evento;
import InformazioneTerritoriale.Itinerario;
import InformazioneTerritoriale.PuntoInteresse;

import java.util.ArrayList;
import java.util.List;

public abstract class BuilderMapItems {

    private List<PuntoInteresse> puntiInteresse;
    private List<Evento> eventi;
    private List<Itinerario> itinerari;
    private String osmData;


    public MapItems getResult() {
        MapItems mapItems = new MapItems(puntiInteresse, eventi, itinerari, osmData);
        this.reset();
        return mapItems;
    }

    public void reset() {
        puntiInteresse = new ArrayList<>();
        eventi = new ArrayList<>();
        itinerari = new ArrayList<>();
        osmData = "";
    }

    public void buildPuntiInteresse(List<PuntoInteresse> puntiInteresse){
        this.puntiInteresse=puntiInteresse;
    }

    public void buildEventi(List<Evento> eventi){
        this.eventi=eventi;
    }

    public void buildItinerari(List<Itinerario> itinerari){
        this.itinerari=itinerari;
    }

    public void buildOsmData(String osmData){
        this.osmData=osmData;
    }



}
