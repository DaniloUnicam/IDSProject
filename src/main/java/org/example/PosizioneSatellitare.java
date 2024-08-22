package org.example;

public class PosizioneSatellitare {
    private final float latitudine;
    private final float longitudine;

    public PosizioneSatellitare(float latitudine, float longitudine) {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public float getLatitudine() {
        return latitudine;
    }

    public float getLongitudine() {
        return longitudine;
    }
}
