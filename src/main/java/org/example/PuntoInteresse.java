package org.example;
public class PuntoInteresse {
    private String nome;
    private String descrizione;
    private String categoria;
    private String indirizzo;   
    private String sitoWeb;
    private String telefono;
    private String email;
    private String orari;
    private String costo;
    private String foto;
    private String latitudine;
    private String longitudine;

    public PuntoInteresse(String nome, String descrizione, String categoria, String indirizzo, String sitoWeb, String telefono, String email, String orari, String costo, String foto, String latitudine, String longitudine) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.categoria = categoria;
        this.indirizzo = indirizzo;
        this.sitoWeb = sitoWeb;
        this.telefono = telefono;
        this.email = email;
        this.orari = orari;
        this.costo = costo;
        this.foto = foto;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getSitoWeb() {
        return sitoWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getOrari() {
        return orari;
    }

    public String getCosto() {
        return costo;
    }

    public String getFoto() {
        return foto;
    }

    public String getLatitudine() {
        return latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }
}