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

    public PuntoInteresse(String nome, String descrizione, String categoria, String indirizzo, String sitoWeb, String telefono, String email, String orari, String costo, String foto) {
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

    @Override
    public String toString() {
        return "PuntoInteresse{" +
                "nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", categoria='" + categoria + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", sitoWeb='" + sitoWeb + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", orari='" + orari + '\'' +
                ", costo='" + costo + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
