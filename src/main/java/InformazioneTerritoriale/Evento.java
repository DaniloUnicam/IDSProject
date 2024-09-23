package InformazioneTerritoriale;

import Model.PosizioneSatellitare;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor(force = true)
@DiscriminatorValue("EVENTO")
@Getter
@Setter
public class Evento extends InformazioneTerritoriale {

    private String nome;
    @Embedded
    private PosizioneSatellitare luogo;
    private String descrizione;
    //id univoco per ogni evento
    @Id
    private final String idEvento = getIdIncrementazione();

    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;

    public Evento(String nome, PosizioneSatellitare luogo, String descrizione, TipoEvento tipo) {
        super(nome, descrizione);
        this.nome = nome;
        this.luogo = luogo;
        this.descrizione = descrizione;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public PosizioneSatellitare getLuogo() {
        return luogo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getID() {
        return idEvento;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

}
