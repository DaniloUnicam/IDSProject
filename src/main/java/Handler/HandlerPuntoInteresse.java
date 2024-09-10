package Handler;

import InformazioneTerritoriale.PuntoInteresse;
//TODO
public class HandlerPuntoInteresse {

    public String creaPOI(PuntoInteresse poi){
        String nome = poi.getNome();
        String descrizione = poi.getDescrizione();
        String id = poi.getID();
        String orarioApertura = poi.getOrarioApertura().toString();
        String orarioChiusura = poi.getOrarioChiusura().toString();
        String tipo = poi.getTipo().toString();
        float valutazione = poi.getValutazione();
        String posizione = poi.getPosizione().toString();
        String s = "POI creato: " + nome + " " + descrizione + " "
                + id + " " + orarioApertura + " " + orarioChiusura
                + " " + tipo + " " + valutazione + " " + posizione;
        return s;
    }

}
