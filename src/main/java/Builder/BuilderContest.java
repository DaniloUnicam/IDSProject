package Builder;


import InformazioneTerritoriale.TipoContest;
import Model.ContenutoMultimediale;
import Model.Contest;

import java.util.ArrayList;
import java.util.List;

public class BuilderContest {

    public String nome;
    public String descrizione;
    public String url;
    public String idCreatore;
    public List<ContenutoMultimediale> contenutiContest;
    public TipoContest tipo;

    public BuilderContest(){

    }

    public void reset(){
        this.nome = "Nome non specificato";
        this.descrizione = "Descrizione non specificata";
        this.url = "URL non specificato";
        this.idCreatore = "ID Creatore non specificato";
        this.contenutiContest = new ArrayList<>();
        this.tipo = TipoContest.ALTRO;
    }

    public void buildNome(String nome){
        this.nome = nome;
    }

    public void buildDescrizione(String testo){
        this.descrizione = testo;
    }

    public void buildTipologia(TipoContest tipo){
        this.tipo = tipo;
    }

    public Contest getResult() {
        Contest contest = new Contest(this.nome, this.descrizione, this.url, this.idCreatore, this.contenutiContest, this.tipo);
        this.reset();
        return contest;
    }
}
