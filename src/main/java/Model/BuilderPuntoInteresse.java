package Model;

import java.util.ArrayList;
import java.util.List;

import static Abstract.Identificabile.getIdIncrementazione; //giusto?

public class BuilderPuntoInteresse extends BuilderInformazioneTerritoriale{

    private Orario orarioApertura;
    private Orario orarioChiusura;
    private float valutazione;
    private List<Contenuto> contenuti= new ArrayList<>();
    private BuilderPuntoInteresse puntoInteresse;

    public BuilderPuntoInteresse() {
        this.puntoInteresse = new BuilderPuntoInteresse();
    }
    @Override
    public void reset() {
        this.puntoInteresse = new BuilderPuntoInteresse();
    }


    @Override
    public BuilderInformazioneTerritoriale getResult() {
        puntoInteresse = new BuilderPuntoInteresse();
        this.reset();
        return puntoInteresse;
    }
}
