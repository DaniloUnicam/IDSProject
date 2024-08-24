package Model;

import Interfacce.Identificabile;

public class Utente implements Identificabile {

        private String id;
        private String nome;
        private String cognome;
        private String email;
        private String password;

        public Utente(String id, String nome, String cognome, String email, String password) {
            this.id = id;
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.password = password;
        }

        public String getNome() {
            return nome;
        }

        public String getCognome() {
            return cognome;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getID() {
            return id;
        }
}
