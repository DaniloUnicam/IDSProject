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

    @Enumerated(EnumType.STRING)
    private TipoItinerario tipoItinerario;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Itinerario_PuntoInteresse",
            joinColumns = @JoinColumn(name = "itinerario_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_punto_interesse", referencedColumnName = "ID"))
    private List<PuntoInteresse> listaPuntiInteresse;

    public Itinerario(String nome, String descrizione, TipoItinerario tipoItinerario, List<PuntoInteresse> listaPuntiInteresse) {
        super(nome, descrizione);
        this.tipoItinerario = tipoItinerario;
        this.listaPuntiInteresse = listaPuntiInteresse;
    }

    @Override
    public long getID() {
        return super.getID();
    }

}
