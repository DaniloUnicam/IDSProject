package Model;

import Abstract.Identificabile;
import Autorizzazioni.Ruolo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe che rappresenta un utente del sistema
 * con le sue informazioni personali e il ruolo che ricopre.
 */
public class Utente extends Identificabile {

        //id univoco dell'utente
        private final String idUtente =getIdIncrementazione();

        //nome dell'utente
        private String nome;

        //cognome dell'utente
        private String cognome;

        //email dell'utente
        private String email;

        //password dell'utente
        private String password;

        //ruolo dell'utente (enumerazione)
        private Ruolo ruolo;

        public Utente(String nome, String cognome, String email, String password, Ruolo ruolo) {
            if(ruolo == null) {
                throw new IllegalArgumentException("Ruolo non valido");
            }
            if(!verificaEmail(email)) {
                throw new IllegalArgumentException("Email non valida");
            }
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.password = password;
            this.ruolo = ruolo;
        }

        /**
         * Metodo che verifica la validità di un indirizzo email.
         * Pattern utilizzato: [A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}
         * il matcher deve essere uguale alla stringa passata come parametro, quindi
         * un alfabeto maiuscolo o minuscolo, numeri, caratteri speciali come ._%+-
         * seguito da @, poi un alfabeto maiuscolo o minuscolo, numeri, caratteri speciali come .-
         * @param email indirizzo email da verificare
         * @return true se l'indirizzo email è valido, false altrimenti
         */
        private boolean verificaEmail(String email) {
            Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
            Matcher mat = pattern.matcher(email);
            return mat.matches();
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

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}
