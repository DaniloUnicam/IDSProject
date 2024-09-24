package HandlerInformazioneTerritoriale;

import InformazioneTerritoriale.InformazioneTerritoriale;
import Repository.RepositoryInformazioni;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@NoArgsConstructor
public class HandlerInformazione {

    @Autowired
    HandlerInformazione handlerInformazione;

    @Autowired
    RepositoryInformazioni repositoryInformazioni;

    //effettua la ricerca di un'informazione territoriale
    public List<InformazioneTerritoriale> richiestaRicerca(String informazioneDaRicercare, TipoInformazioneTerritoriale tipologia) {
        List  <InformazioneTerritoriale> informazioni= new ArrayList<>();
        for (InformazioneTerritoriale informazione : repositoryInformazioni.findAll()) {
            if (informazione.getNome().contains(informazioneDaRicercare) && informazione.getTipoInformazioneTerritoriale(tipologia).equals(tipologia)) {
                informazioni.add(informazione);
            }
        }
        return informazioni;
    }

}
