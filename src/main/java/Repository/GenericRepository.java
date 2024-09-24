package Repository;

import Abstract.Identificabile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Questa classe è considerata un Singleton.
public class GenericRepository <T extends Identificabile> {

    private static GenericRepository genericRepository;

    private HashMap<String,T> oggettiGenerici;

    protected GenericRepository(HashMap<String,T> oggettiGenerici) {
        this.oggettiGenerici = oggettiGenerici;
    }

    public static GenericRepository getInstance() {
        if (genericRepository == null) {
            genericRepository = new GenericRepository(new HashMap<String,Identificabile>());
        }
        return genericRepository;
    }

    public void add(T entity) {
        this.entityIsNullCheck(entity);
        if(this.oggettiGenerici.containsKey(entity.getID())) {
            throw new IllegalArgumentException("L'entità è già presente nel repository");
        }
        this.oggettiGenerici.put(entity.getID(),entity);
    }

    public void remove(T entity) {
        this.entityIsNullCheck(entity);
        if(!this.oggettiGenerici.containsKey(entity.getID())) {
            throw new IllegalArgumentException("L'entità non è presente nel repository");
        }
        this.oggettiGenerici.remove(entity.getID(),entity);
    }

    public boolean contains(T entity) {
        this.entityIsNullCheck(entity);
        return this.oggettiGenerici.containsKey(entity.getID());
    }

    public int size() {
        return this.oggettiGenerici.size();
    }

    public void clear() {
        this.oggettiGenerici = new HashMap<String,T>();
    }

    public boolean isEmpty() {
        return this.oggettiGenerici.size() == 0;
    }

    public T ottieni(String id) {
        this.entityIsNullCheck(this.oggettiGenerici.get(id));
        return this.oggettiGenerici.get(id);
    }

    public void update(T entity) {
        this.entityIsNullCheck(entity);
        this.oggettiGenerici.put(entity.getID(),entity);
    }

    public String getID(T entity) {
        this.entityIsNullCheck(entity);
        return entity.getID();
    }

    //Prende tutte le entità presenti nel repository e le mette in una lista
    public List<T> getAll() {
        return new ArrayList<>(this.oggettiGenerici.values());
    }

    //Controlla se l'entità è nulla o se non ha un ID
    private void entityIsNullCheck(T entity) {
        if(entity == null) {
            throw new IllegalArgumentException("Errore, non esiste una repository");
        }
        if(entity.getID() == null) {
            throw new IllegalArgumentException("L'entità non ha un ID");
        }
        if(entity.getID().isEmpty()) {
            throw new IllegalArgumentException("L'entità non ha un ID");
        }
    }

}
