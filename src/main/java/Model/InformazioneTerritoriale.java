package Model;

import Interfacce.Identificabile;

public class InformazioneTerritoriale extends Identificabile {
    private final String id =getIdIncrementazione();
    @Override
    public String getID() {
        return id;
    }
}
