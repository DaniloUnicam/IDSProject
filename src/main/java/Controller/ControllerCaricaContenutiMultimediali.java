package Controller;

import InformazioneTerritoriale.PuntoInteresse;
import Model.ContenutoMultimediale;
import Repository.RepositoryPuntoInteresse;

//TODO
public class ControllerCaricaContenutiMultimediali {

    private static RepositoryPuntoInteresse repositoryPuntiInteresse
            = RepositoryPuntoInteresse.getInstance();

    public boolean selezionaPuntoInteresseID(String idPuntoInteresse) {
        if (repositoryPuntiInteresse.contains(repositoryPuntiInteresse.ottieni(idPuntoInteresse))) {
            repositoryPuntiInteresse.ottieni(idPuntoInteresse);
            return true;
        }
        return false;
    }

    public void caricaContenuto (String idPunto, ContenutoMultimediale file){
        if(repositoryPuntiInteresse.contains(repositoryPuntiInteresse.ottieni(idPunto))){
            PuntoInteresse punto = repositoryPuntiInteresse.ottieni(idPunto);
            punto.caricaContenuto(file);
        }
    }

    public PuntoInteresse visualizzareContenuti (String idPuntoInteresse, String idContenuto){
        if(repositoryPuntiInteresse.contains(repositoryPuntiInteresse.ottieni(idContenuto))){
            return repositoryPuntiInteresse.ottieni(idPuntoInteresse).visualizzareContenuto(idContenuto);
        }
        return null;
    }


}

