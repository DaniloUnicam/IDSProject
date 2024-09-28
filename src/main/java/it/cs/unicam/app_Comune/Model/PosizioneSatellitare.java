package it.cs.unicam.app_Comune.Model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import it.cs.unicam.app_Comune.Abstract.PosizioneSatellitareDeserializer;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(force = true)
@JsonDeserialize(using = PosizioneSatellitareDeserializer.class)
public class PosizioneSatellitare {

    @Column(insertable = false, updatable = false)
    private final double latitudine;

    @Column(insertable = false, updatable = false)
    private final double longitudine;

    public PosizioneSatellitare(double latitudine, double longitudine) {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public double getLatitudine() {
        return latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }
}
