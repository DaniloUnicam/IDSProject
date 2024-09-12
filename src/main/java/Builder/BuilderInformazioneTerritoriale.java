package Builder;

/**
 * Builder per la creazione di un'informazione territoriale
 * @see InformazioneTerritoriale
 */

import InformazioneTerritoriale.InformazioneTerritoriale;

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
