package classes;

public class Contatto {
    private String nome;
    private String cognome;
    private String telefono;
    private String email;

    public Contatto() {
    }

    public Contatto(String nome, String cognome, String telefono, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // to string
    @Override
    public String toString() {
        return "Contatto{" + "nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", email=" + email + '}';
    }
}
