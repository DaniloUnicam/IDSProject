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

public class HandlerMappa {
    HandlerOSMConnection handlerOSMConnection = new HandlerOSMConnection();

    public HandlerMappa() throws MalformedURLException {
    }

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

    private boolean contiene(PosizioneSatellitare posizionex, PosizioneSatellitare posizioney,
                             PosizioneSatellitare target) {
        return target.getLatitudine() >= posizionex.getLatitudine() &&
                target.getLatitudine() <= posizioney.getLatitudine() &&
                target.getLongitudine() >= posizionex.getLongitudine() &&
                target.getLongitudine() <= posizioney.getLongitudine();
    }

    private <T extends Posizionabile> List<T> filtra(List<T> lista,
                                                     PosizioneSatellitare angoloBassoSinistra,
                                                     PosizioneSatellitare angoloAltoDestro) {
        return lista.stream().filter(posizionabile -> contiene(angoloBassoSinistra, angoloAltoDestro,
                posizionabile.getPosizione())).toList();
    }


}
