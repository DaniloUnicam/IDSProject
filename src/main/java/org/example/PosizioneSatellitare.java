package org.example;

public class PosizioneSatellitare {
    private float latitudine;
    private float longitudine;

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

    public void setLatitudine(float latitudine) {
        this.latitudine = latitudine;
    }

    public void setLongitudine(float longitudine) {
        this.longitudine = longitudine;
    }


}
