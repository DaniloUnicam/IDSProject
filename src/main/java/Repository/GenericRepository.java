package Repository;

import Interfacce.Identificabile;

import java.util.HashMap;

public class GenericRepository <T extends Identificabile> {

    private HashMap<String,T> entities;

    public GenericRepository(HashMap<String,T> entities) {
        this.entities = entities;
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
        return this.entities.isEmpty();
    }

    public boolean equals(Object o) {
        return this.entities.containsKey(o);
    }

}
