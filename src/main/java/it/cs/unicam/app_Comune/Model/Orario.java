package it.cs.unicam.app_Comune.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(force = true)
public class Orario {


    @Column(insertable = false, updatable = false)
    private int ora;

    @Column(insertable = false, updatable = false)
    private int minuti;

    public Orario (int ora, int minuti) {
        if(ora < 0 || ora > 23 || minuti < 0 || minuti > 59) throw new IllegalArgumentException("Orario non valido");
        this.ora = ora;
        this.minuti = minuti;
    }

    public int getOra () {
        return ora;
    }

    public int getMinuti () {
        return minuti;
    }

    public void setOra (int ora) {
        this.ora = ora;
    }

    public void setMinuti (int minuti) {
        this.minuti = minuti;
    }

    public boolean isMaggiore (Orario orario) {
        if (ora > orario.getOra()) {
            return true;
        } else if (ora == orario.getOra() && minuti > orario.getMinuti()) {
            return true;
        }
        return false;
    }

    public boolean isMinore (Orario orario) {
        if (ora < orario.getOra()) {
            return true;
        } else if (ora == orario.getOra() && minuti < orario.getMinuti()) {
            return true;
        }
        return false;
    }

    public boolean isUguale (Orario orario) {
        return ora == orario.getOra() && minuti == orario.getMinuti();
    }

    public boolean isMaggioreUguale (Orario orario) {
        return isMaggiore(orario) || isUguale(orario);
    }

    public boolean isMinoreUguale (Orario orario) {
        return isMinore(orario) || isUguale(orario);
    }

    public String toString () {
        return ora + ":" + minuti;
    }

}
