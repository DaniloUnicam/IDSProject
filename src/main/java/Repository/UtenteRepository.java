package Repository;

public class UtenteRepository {

    private static UtenteRepository instance;

    private UtenteRepository() {
        super(new HashMap<String,Utente>());
    }

    public static UtenteRepository getInstance() {
        if (instance == null) {
            instance = new UtenteRepository();
        }
        return instance;
    }


}