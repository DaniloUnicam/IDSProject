package Repository;

import InformazioneTerritoriale.InformazioneTerritoriale;
import InformazioneTerritoriale.PuntoInteresse;
import InformazioneTerritoriale.TipoInformazioneTerritoriale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositoryPuntoInteresse extends GenericRepository<PuntoInteresse> {

    private static RepositoryPuntoInteresse repositoryPuntoInteresse;

    private RepositoryPuntoInteresse() {
        super(new HashMap<String, PuntoInteresse>());
    }

    public static RepositoryPuntoInteresse getInstance() {
        if (repositoryPuntoInteresse == null) {
            repositoryPuntoInteresse = new RepositoryPuntoInteresse();
        }
        return repositoryPuntoInteresse;
    }

    /**
     * Metodo che restituisce una lista di informazioni territoriali di una determinata tipologia
     *
     * @param tipologia tipologia di informazione territoriale
     * @return lista di informazioni territoriali
     */
    public List<InformazioneTerritoriale> richiesta(TipoInformazioneTerritoriale tipologia) {
        List<InformazioneTerritoriale> lista = new ArrayList<>();
        for (PuntoInteresse p : this.getAll()) {
            if (p.getTipo().equals(tipologia)) {
                lista.add(p);
            }
        }
        return lista;
    }

    /**
     * Metodo che restituisce una informazione territoriale in base all'id
     *
     * @param idInfo id dell'informazione territoriale
     * @return informazione territoriale
     */
    public InformazioneTerritoriale ottieniInformazione(String idInfo) {
        for (PuntoInteresse p : this.getAll()) {
            if (p.getID().equals(idInfo)) {
                return p;
            }
        }
        return null;
    }

}