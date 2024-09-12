package Autorizzazioni;

public class Autorizzazione {

    private Ruolo ruolo;

    public Autorizzazione(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public boolean isRuolo(Ruolo ruolo){
        switch(ruolo) {
            case Gestore_Della_Piattaforma:
                return this.ruolo == Ruolo.Gestore_Della_Piattaforma;
            case Responsabile_Territorio_Comunale:
                return this.ruolo == Ruolo.Responsabile_Territorio_Comunale;
            case Curatore:
                return this.ruolo == Ruolo.Curatore;
            case Contributor_Autorizzato:
                return this.ruolo == Ruolo.Contributor_Autorizzato;
            case Animatore_Autorizzato:
                return this.ruolo == Ruolo.Animatore_Autorizzato;
            case Turista:
                return this.ruolo == Ruolo.Turista;
            default:
                return false;
        }
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

}
