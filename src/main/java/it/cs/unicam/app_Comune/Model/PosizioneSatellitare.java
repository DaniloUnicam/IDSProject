package it.cs.unicam.app_Comune.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(force = true)
public class PosizioneSatellitare {

    @Column(insertable = false, updatable = false)
    private final float latitudine;

    @Column(insertable = false, updatable = false)
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
