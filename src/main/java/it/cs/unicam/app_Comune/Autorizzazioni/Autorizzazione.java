package it.cs.unicam.app_Comune.Autorizzazioni;
/**
 * Classe che rappresenta un' autorizzazione
 */
public class Autorizzazione {

    private Ruolo ruolo;

    public Autorizzazione(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public boolean isRuolo(Ruolo ruolo){
        return this.ruolo.equals(ruolo);
    }

    /**
     * Verifica se l'utente ha il permesso di eseguire un'operazione
     * @param ruolo ruolo minimo richiesto per eseguire l'operazione (partendo dal più basso)
     * @return true se l'utente ha il permesso, false altrimenti
     */
    public boolean haPermesso(Ruolo ruolo){
        return this.ruolo.ordinal() >= ruolo.ordinal();
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

}
