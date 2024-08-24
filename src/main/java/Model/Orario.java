package Model;

public class Orario {

    private int ora;
    private int minuti;

    public Orario (int ora, int minuti) {
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
