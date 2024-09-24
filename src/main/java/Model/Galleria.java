package Model;

import Abstract.Identificabile;
import InformazioneTerritoriale.InformazioneTerritoriale;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@Getter
@Setter
public class Galleria extends Identificabile {

    //lista di contenuti presenti nella galleria
    @OneToMany
    @JoinTable(name = "galleria_contenuto",
            joinColumns = @JoinColumn(name = "Galleria_idGalleria", referencedColumnName = "idGalleria"),
            inverseJoinColumns = @JoinColumn(name = "informazione_idInformazioneTerritoriale", referencedColumnName = "idInformazioneTerritoriale"))
    private List<InformazioneTerritoriale> contenuti;

    //id univoco per ogni galleria
    @Id
    private final String idGalleria = getIdIncrementazione();

    //utente proprietario della galleria
    @ManyToOne
    @JoinTable(name = "utente_galleria",
            joinColumns = @JoinColumn(name = "Galleria_idGalleria", referencedColumnName = "idGalleria"),
            inverseJoinColumns = @JoinColumn(name = "Utente_idUtente", referencedColumnName = "idUtente"))
    private final Utente utente;

    public Galleria(List<InformazioneTerritoriale> informazioneTerritoriali, Utente utente){
        this.contenuti = informazioneTerritoriali;
        this.utente = utente;
    }
    

    public Utente getUtente() {
        return utente;
    }

    public List<InformazioneTerritoriale> getContenuti(){
        return contenuti;
    }

    public void setContenuti(List<InformazioneTerritoriale> contenuti){
        this.contenuti = contenuti;
    }

    //aggiunge un contenuto alla galleria
    public void addContenuto(InformazioneTerritoriale informazioneTerritoriali){
        notNull(informazioneTerritoriali);
        if(!this.contiene(informazioneTerritoriali))
            contenuti.add(informazioneTerritoriali);
    }

    //rimuove un contenuto dalla galleria
    public void removeContenuto(InformazioneTerritoriale informazioneTerritoriali){
        notNull(informazioneTerritoriali);
        if(this.contiene(informazioneTerritoriali))
            contenuti.remove(informazioneTerritoriali);
    }

    private boolean contiene(InformazioneTerritoriale informazioneTerritoriale){
        return contenuti.contains(informazioneTerritoriale);
    }

    private void notNull(Object o){
        if(o == null){
            throw new IllegalArgumentException("Elemento nullo");
        }
    }

    @Override
    public String getID() {
        return idGalleria;
    }
}
