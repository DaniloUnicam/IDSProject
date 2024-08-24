package Repository;

import Interfacce.Identificabile;
import Model.PuntoInteresse;

import java.util.HashMap;

public class PuntoInteresseRepository extends GenericRepository<PuntoInteresse> {

    private static PuntoInteresseRepository instance;

    private PuntoInteresseRepository() {
        super(new HashMap<String,PuntoInteresse>());
    }

    public static PuntoInteresseRepository getInstance() {
        if (instance == null) {
            instance = new PuntoInteresseRepository();
        }
        return instance;
    }


}
