package Repository;

import Abstract.Identificabile;

import java.util.HashMap;

//Questa classe è considerata un Singleton.
public class GenericRepository <T extends Identificabile> {

    private static GenericRepository genericRepository;

    private HashMap<String,T> entities;

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
        this.entities.put(entity.getID(),entity);
    }

    public void remove(T entity) {
        this.entities.remove(entity.getID(),entity);
    }


    public boolean contains(T entity) {
        return this.entities.containsKey(entity.getID());
    }

    public int size() {
        return this.entities.size();
    }

    public void clear() {
        this.entities.clear();
    }

    public boolean isEmpty() {
        return this.entities.size() == 0;
    }

    public boolean equals(Object o) {
        return this.entities.containsKey(o);
    }

}
