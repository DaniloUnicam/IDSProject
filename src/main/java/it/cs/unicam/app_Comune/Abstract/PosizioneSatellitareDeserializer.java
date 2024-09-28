package it.cs.unicam.app_Comune.Abstract;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;

import java.io.IOException;

public class PosizioneSatellitareDeserializer extends JsonDeserializer<PosizioneSatellitare> {

    @Override
    public PosizioneSatellitare deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String[] parts = p.getText().split(",");
        double latitude = Double.parseDouble(parts[0]);
        double longitude = Double.parseDouble(parts[1]);
        return new PosizioneSatellitare(latitude, longitude);
    }
}