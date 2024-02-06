package org.example;

public class Comune {
    private String nome;
    private String codice;
    private String regione;
    private String provincia;

    public Comune(String nome, String codice, String regione, String provincia) {
        this.nome = nome;
        this.codice = codice;
        this.regione = regione;
        this.provincia = provincia;
    }

    public boolean selezionaPOIPartenza(String id) {
        return false;
    }

    public boolean selezionaPOIDestinazione(String id) {
        return false;
    }

    public boolean selezionaPuntoInteresseID(String id) {
        return false;
    }

    public Contenuto cariaContenuto(Contenuto file, String commento) {
        return null;
    }

    public PuntoInteresse visualizzareContenuto(String id) {
        return null;
    }


}
