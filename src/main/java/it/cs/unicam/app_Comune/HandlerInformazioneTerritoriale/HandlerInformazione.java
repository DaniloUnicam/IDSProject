package it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.InformazioneTerritoriale;
import it.cs.unicam.app_Comune.Repository.RepositoryInformazioni;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoInformazioneTerritoriale;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@NoArgsConstructor
public class HandlerInformazione {

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
