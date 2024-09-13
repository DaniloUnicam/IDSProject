package HandlerInformazioneTerritoriale;

import Builder.BuilderPuntoInteresse;
import InformazioneTerritoriale.PuntoInteresse;

public class HandlerPuntoInteresse {

    public String creaPOI(PuntoInteresse poi){
        BuilderPuntoInteresse builderPuntoInteresse = new BuilderPuntoInteresse();
        builderPuntoInteresse.getResult(poi);
        return poi.getID();
    }

}
