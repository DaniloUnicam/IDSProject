package it.cs.unicam.app_Comune.InformazioneTerritoriale;

import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;
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

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    public Evento(String nome, PosizioneSatellitare luogo, String descrizione, TipoEvento tipo) {
        super(nome, descrizione, luogo);
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipoEvento = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public long getID() {
        return super.getID();
    }

}