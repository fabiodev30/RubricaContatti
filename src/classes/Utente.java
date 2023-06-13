package classes;

public class Utente {
    private String nome;
    private String cognome;

    public Utente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public String generaUsername() {
        String username = this.nome + "." + this.cognome;
        return username.toLowerCase();
    }

    // crea rubrica
    public Rubrica creaRubrica() {
        String username = generaUsername();
        Rubrica rubrica = new Rubrica(username);
        return rubrica;
    }
}
