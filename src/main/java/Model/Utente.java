package Model;

import Abstract.Identificabile;
import Autorizzazioni.Ruolo;
/**
 * Classe che rappresenta un utente
 */
public class Utente extends Identificabile {

        //id univoco dell'utente
        private final String idUtente =getIdIncrementazione();
        private String nome;
        private String cognome;
        private String email;
        private String password;
        //ruolo dell'utente
        private Ruolo ruolo;

        public Utente(String nome, String cognome, String email, String password) {
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.password = password;
        }

        public Utente(String nome, String cognome, String email, String password, Ruolo ruolo) {
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.password = password;
            this.ruolo = ruolo;
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
            return idUtente;
        }

        public Ruolo getRuolo() {
            return ruolo;
        }

        public void setRuolo(Ruolo ruolo) {
            this.ruolo = ruolo;
        }
}
