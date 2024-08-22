package Repository;

import java.util.Set;
import java.util.stream.Collectors;

public class RepositoryGeneric<T>{

    //Dove verranno inseriti i vari oggetti appartenenti al comune. (POI, Eventi, Utenti, etc.)
    private Set<T> entities;

    public RepositoryGeneric(Set<T> entities) {
        this.entities = entities;
    }

    public void add(T entity) {
        this.entities.add(entity);
    }

    public void remove(T entity) {
        this.entities.remove(entity);
    }


    public boolean contains(T entity) {
        return this.entities.contains(entity);
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
        return this.entities.stream().anyMatch(o::equals);
    }

    public Set<T> getEntities() {
        return entities.stream().collect(Collectors.toSet());
    }

    public void setEntities(Set<T> entities) {
        this.entities = entities;
    }
}
