package OSM;

import InformazioneTerritoriale.Evento;
import InformazioneTerritoriale.Itinerario;
import InformazioneTerritoriale.PuntoInteresse;
import Model.Posizionabile;
import Model.PosizioneSatellitare;
import Repository.RepositoryEvento;
import Repository.RepositoryItinerario;
import Repository.RepositoryPuntoInteresse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
/**
 * Classe che gestisce la richiesta di una mappa con i punti di interesse,
 * eventi e itinerari presenti in un'area definita.
 */
public class HandlerMappa {
    HandlerOSMConnection handlerOSMConnection = new HandlerOSMConnection();

    public HandlerMappa() throws MalformedURLException {
    }

    /**
     * Richiede la mappa con i punti di interesse, eventi e itinerari presenti in un'area definita
     * @param posizionex angolo in basso a sinistra dell'area
     * @param posizioney angolo in alto a destra dell'area
     * @return mappa con i punti di interesse, eventi e itinerari presenti nell'area
     * @throws IOException se si verifica un errore durante la richiesta della mappa
     */
    public MapItems richiediMappa(PosizioneSatellitare posizionex, PosizioneSatellitare posizioney) throws IOException {
        RepositoryPuntoInteresse repositoryPuntoInteresse = RepositoryPuntoInteresse.getInstance();
        RepositoryEvento repositoryEvento = RepositoryEvento.getInstance();
        RepositoryItinerario repositoryItinerario = RepositoryItinerario.getInstance();
        List<PuntoInteresse> puntiInteresse = repositoryPuntoInteresse.getAll();
        List<Evento> eventi = repositoryEvento.getAll();
        List<Itinerario> itinerari = repositoryItinerario.getAll();
        return new MapItems(filtra(puntiInteresse,posizionex,posizioney),
                filtra(eventi,posizionex,posizioney),
                filtra(itinerari,posizionex,posizioney),
                handlerOSMConnection.retrieveOSMData(posizionex,posizioney));
    }

    /**
     * Verifica se una posizione è contenuta in un'area definita
     * @param posizionex angolo in basso a sinistra dell'area
     * @param posizioney angolo in alto a destra dell'area
     * @param target posizione da verificare
     * @return true se la posizione è contenuta nell'area, false altrimenti
     */
    private boolean contiene(PosizioneSatellitare posizionex, PosizioneSatellitare posizioney,
                             PosizioneSatellitare target) {
        return target.getLatitudine() >= posizionex.getLatitudine() &&
                target.getLatitudine() <= posizioney.getLatitudine() &&
                target.getLongitudine() >= posizionex.getLongitudine() &&
                target.getLongitudine() <= posizioney.getLongitudine();
    }

    /**
     * Filtra una lista di posizionabili in base a un'area definita
     * @param lista lista di posizionabili da filtrare
     * @param angoloBassoSinistra angolo in basso a sinistra dell'area
     * @param angoloAltoDestro angolo in alto a destra dell'area
     * @param <T> tipo di posizionabile
     * @return lista di posizionabili contenuti nell'area
     */
    private <T extends Posizionabile> List<T> filtra(List<T> lista,
                                                     PosizioneSatellitare angoloBassoSinistra,
                                                     PosizioneSatellitare angoloAltoDestro) {
        return lista.stream().filter(posizionabile -> contiene(angoloBassoSinistra, angoloAltoDestro,
                posizionabile.getPosizione())).toList();
    }


}
