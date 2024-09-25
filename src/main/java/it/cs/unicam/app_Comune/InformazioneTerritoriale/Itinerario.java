package it.cs.unicam.app_Comune.InformazioneTerritoriale;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("ITINERARIO")
@Getter
@Setter

public class Itinerario extends InformazioneTerritoriale {

    protected String nome;
    protected String descrizione;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Itinerario_PuntoInteresse",
            joinColumns = @JoinColumn(name = "itinerario_ID", referencedColumnName = "idItinerario"),
            inverseJoinColumns = @JoinColumn(name = "ID_punto_interesse", referencedColumnName = "idPuntoInteresse"))
    private List<PuntoInteresse> listaPuntiInteresse;

    //id univoco per ogni itinerario
    private long idItinerario;

    public Itinerario(String nome, String descrizione, List<PuntoInteresse> listaPuntiInteresse) {
        super(nome, descrizione);
        this.listaPuntiInteresse = listaPuntiInteresse;
    }

    public List<PuntoInteresse> getListaPuntiInteresse() {
        return listaPuntiInteresse;
    }

    @Override
    public long getID() {
        return idItinerario;
    }

}
