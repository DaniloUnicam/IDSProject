package FactoryNotifiche;


import Abstract.Identificabile;

public class Notifica extends Identificabile {

    private String testo;

    private boolean letta = false;

    //Le notifiche saranno ordinate in base alla priorità (da 1 a 5, dove 1 è la priorità più alta)
    private float priorita;

    private final String idNotifica = getIdIncrementazione();

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
        this.letta = letta;
    }

    @Override
    public String getID() {
        return idNotifica;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public boolean isLetta() {
        return letta;
    }

    public void setLetta(boolean letta) {
        this.letta = letta;
    }

    public float getPriorita() {
        return priorita;
    }

    public void setPriorita(float priorita) {
        this.priorita = priorita;
    }

    public void setPriorita(String idNotifica, float priorita) {
        this.priorita = priorita;
    }

    public void setLetta(String idNotifica, boolean letta) {
        this.letta = letta;
    }

    public void setTesto(String idNotifica, String testo) {
        this.testo = testo;
    }


}
