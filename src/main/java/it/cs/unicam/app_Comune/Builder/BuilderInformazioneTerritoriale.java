package it.cs.unicam.app_Comune.Builder;

/**
 * it.cs.unicam.app_Comune.Builder per la creazione di un'informazione territoriale
 * @see it.cs.unicam.app_Comune.InformazioneTerritoriale
 */

import it.cs.unicam.app_Comune.InformazioneTerritoriale.InformazioneTerritoriale;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoItinerario;

public abstract class BuilderInformazioneTerritoriale {

    protected String nome;
    protected String descrizione;


    public abstract void reset();

    public void buildNome(String nome){
        this.nome=nome;
    }
    public void buildDescrizione(String descrizione){
        this.descrizione=descrizione;
    }


    public abstract InformazioneTerritoriale getResult();

}
