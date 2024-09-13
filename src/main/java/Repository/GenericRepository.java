package Repository;

import Abstract.Identificabile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Questa classe è considerata un Singleton.
public class GenericRepository <T extends Identificabile> {

    private static GenericRepository genericRepository;

    private HashMap<String,T> entities ;

    protected GenericRepository(HashMap<String,T> entities) {
        this.entities = entities;
    }

    public static GenericRepository getInstance() {
        if (genericRepository == null) {
            genericRepository = new GenericRepository(new HashMap<String,Identificabile>());
        }
        return genericRepository;
    }

    public void add(T entity) {
        this.entityIsNullCheck(entity);
        if(this.entities.containsKey(entity.getID())) {
            throw new IllegalArgumentException("L'entità è già presente nel repository");
        }
        this.entities.put(entity.getID(),entity);
    }

    public void remove(T entity) {
        this.entityIsNullCheck(entity);
        if(!this.entities.containsKey(entity.getID())) {
            throw new IllegalArgumentException("L'entità non è presente nel repository");
        }
        this.entities.remove(entity.getID(),entity);
    }

    public boolean contains(T entity) {
        this.entityIsNullCheck(entity);
        return this.entities.containsKey(entity.getID());
    }

    public int size() {
        return this.entities.size();
    }

    public void clear() {
        this.entities = new HashMap<String,T>();
    }

    public boolean isEmpty() {
        return this.entities.size() == 0;
    }

    public T ottieni(String id) {
        this.entityIsNullCheck(this.entities.get(id));
        return this.entities.get(id);
    }

    public void update(T entity) {
        this.entityIsNullCheck(entity);
        this.entities.put(entity.getID(),entity);
    }

    public String getID(T entity) {
        this.entityIsNullCheck(entity);
        return entity.getID();
    }

    //Prende tutte le entità presenti nel repository e le mette in una lista
    public List<T> getAll() {
        return new ArrayList<>(this.entities.values());
    }

    //Controlla se l'entità è nulla o se non ha un ID
    private void entityIsNullCheck(T entity) {
        if(entity == null) {
            throw new IllegalArgumentException("L'entità è nulla");
        }
        if(entity.getID() == null) {
            throw new IllegalArgumentException("L'entità non ha un ID");
        }
    }
}
