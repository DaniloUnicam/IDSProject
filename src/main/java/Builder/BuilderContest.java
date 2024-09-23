package Builder;


import InformazioneTerritoriale.TipoContest;
import Model.Contenuto;
import Model.Contest;
import Model.Utente;

import java.util.ArrayList;
import java.util.List;

public class BuilderContest {

    public String nome;
    public String descrizione;
    public String url;
    public Utente creatore;
    public List<Contenuto> contenutiContest;
    public TipoContest tipo;
    public List<Utente> iscritti;

    public BuilderContest(){

    }

    public void reset(){
        this.nome = "Nome non specificato";
        this.descrizione = "Descrizione non specificata";
        this.url = "URL non specificato";
        this.creatore = new Utente();
        this.iscritti = new ArrayList<>();
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

    public void buildUrl(String url){
        this.url = url;
    }

    public void buildCreatore(Utente creatore){
        this.creatore = creatore;
    }

    public void buildIscritti(List<Utente> iscritti){
        this.iscritti = iscritti;
    }

    public Contest getResult() {
        Contest contest = new Contest(nome, descrizione, url, creatore);
        this.reset();
        return contest;
    }
}
