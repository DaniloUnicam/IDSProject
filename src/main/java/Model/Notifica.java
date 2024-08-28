package Model;

import Abstract.Identificabile;

public class Notifica extends Identificabile {

    //ID della notifica
    private String id;

    //Flag che indica se la notifica è stata letta
    private boolean letta;

    //Messaggio della notifica
    private String testo;

    //Priorità della notifica
    private float priority;

    public Notifica(String id, String testo, float priority) {
        this.id = id;
        this.testo = testo;
        this.priority = priority;
        this.letta = false;
    }

    @Override
    public String getID() {
        return id;
    }

    public String getTesto() {
        return testo;
    }

    public float getPriority() {
        return priority;
    }

    public boolean stataLetta() {
        return letta;
    }


}
