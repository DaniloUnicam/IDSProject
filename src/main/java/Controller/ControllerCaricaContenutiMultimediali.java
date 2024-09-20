package Controller;

import InformazioneTerritoriale.PuntoInteresse;
import Model.Contenuto;
import Model.ContenutoMultimediale;
import Repository.RepositoryPuntoInteresse;

//TODO
public class ControllerCaricaContenutiMultimediali {

    public ControllerCaricaContenutiMultimediali() {

    }

    public boolean riercaPuntoInteresseID(String idPuntoInteresse) {
        return ottieniPuntoInteresseDaRepository(idPuntoInteresse) != null;
    }

    public void caricaContenuto (String idPunto, ContenutoMultimediale file){
        ottieniPuntoInteresseDaRepository(idPunto).caricaContenuto(file);
    }

    public Contenuto visualizzareContenuti (String idPuntoInteresse, String idContenuto){
        return ottieniPuntoInteresseDaRepository(idPuntoInteresse).visualizzareContenuto(idContenuto);
    }

    private PuntoInteresse ottieniPuntoInteresseDaRepository(String idPuntoInteresse){
        return RepositoryPuntoInteresse.getInstance().ottieni(idPuntoInteresse);
    }

}

