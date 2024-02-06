package org.example;

public class Orario {
    private int ore;
    private int minuti;

    public static final int ORE_IN_UN_GIORNO = 24;
    public static final int MINUTI_IN_UN_ORA = 60;

    public Orario(int minuti) {
        this.ore = minuti / MINUTI_IN_UN_ORA;
        this.minuti = minuti % MINUTI_IN_UN_ORA;
    }

    public Orario(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
}
