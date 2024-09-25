package it.cs.unicam.app_Comune.FactoryNotifiche;

import it.cs.unicam.app_Comune.Abstract.Identificabile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
public class BachecaNotifiche implements Identificabile {

    //Notifiche presenti nella bacheca
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "BachecaNotifiche_Notifiche",
            joinColumns = @JoinColumn(name = "bachecaNotifica_id", referencedColumnName = "idBachecaNotifiche"),
            inverseJoinColumns = @JoinColumn(name = "notifica_id", referencedColumnName = "idNotifica"))
    private List<Notifica> notifiche;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBachecaNotifiche;

    public BachecaNotifiche() {
        this.notifiche = new ArrayList<>();
    }

    //Aggiunge una notifica alla bacheca
    public void aggiungiNotifica(Notifica notifica) {
        this.notifiche.add(notifica);
        sortNotifiche(this.notifiche);
    }
    //Rimuove una notifica dalla bacheca
    public void rimuoviNotifica(Notifica notifica) {
        this.notifiche.remove(notifica);
        sortNotifiche(this.notifiche);
    }

    //Rimuove tutte le notifiche dalla bacheca
    public void rimuoviTutteNotifiche() {
        this.notifiche.clear();
    }

    /**
     * Ordina le notifiche in base alla priorità (dal più alto al più basso, 1-5)
     * @param notifiche con le notifiche da ordinare
     * @return List<Notifica> con le notifiche ordinate
     */
    public List<Notifica> sortNotifiche(List<Notifica> notifiche) {
        return notifiche.stream()
                .sorted(Comparator.comparing(Notifica::getPriorita).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public long getID() {
        return idBachecaNotifiche;
    }
}