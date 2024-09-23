package FactoryNotifiche;


import Abstract.Identificabile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_notifica", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
public abstract class Notifica extends Identificabile {

    private String testo;

    //Indica se la notifica è stata letta o meno, di default è false (non letta)
    private boolean letta = false;

    //Le notifiche saranno ordinate in base alla priorità (da 1 a 5, dove 1 è la priorità più alta)
    private float priorita;

    @Id
    //id univoco per ogni notifica
    private final String idNotifica = getIdIncrementazione();

    @Enumerated(EnumType.STRING)
    private TipoNotifica tipoNotifica;

    public Notifica() {
        super();
    }

    public Notifica(String testo, float priorita) {
        this.testo = testo;
        this.priorita = priorita;
    }

    public Notifica(String testo, float priorita, TipoNotifica tipoNotifica, boolean letta) {
        this.testo = testo;
        this.priorita = priorita;
        this.tipoNotifica = tipoNotifica;
        this.letta = letta;
    }

    public Notifica(String testo, float priorita, boolean letta) {
        this.testo = testo;
        this.priorita = priorita;
        this.letta = letta;
    }

    @Override
    public String getID() {
        return idNotifica;
    }

}
