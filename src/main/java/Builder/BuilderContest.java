package Builder;


import InformazioneTerritoriale.TipoContest;
import Model.Contest;

public class BuilderContest {

    public String nome;
    public String descrizione;
    public TipoContest tipo;

    public BuilderContest(){

    }

    public void reset(){
        this.nome = "Nome non specificato";
        this.descrizione = "Descrizione non speciificata";
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
        Contest contest = new Contest(nome, descrizione, tipo);
        this.reset();
        return contest;
    }
}
