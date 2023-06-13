package classes;

import java.util.ArrayList;

public class Rubrica {
    // lista dinamica di contatti dato che non sappiamo quanti contatti ci saranno
    private ArrayList<Contatto> contatti;
    private String nomeUtente;

    public Rubrica(String nomeUtente) {
        this.contatti = new ArrayList<Contatto>();
        this.nomeUtente=nomeUtente;
    }

    public void aggiungiContatto(Contatto contatto) {
        contatti.add(contatto);
    }

    public void rimuoviContatto(Contatto contatto) {
        contatti.remove(contatto);
    }

    public Contatto getContatto(int index) {
        return contatti.get(index);
    }

    // modifica contatto
    public void modificaContatto(int index, Contatto contatto) {
        contatti.set(index, contatto);
    }

    public int getNumeroContatti() {
        return contatti.size();
    }

    public ArrayList<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(ArrayList<Contatto> contatti) {
        this.contatti = contatti;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }
    public Contatto recuperaContattoByEmail(String email) {
        for (Contatto contatto : contatti) {
            if (contatto.getEmail().equals(email)) {
                return contatto;
            }
        }
        return null;
    }

    // to string
    @Override
    public String toString() {
        String stringa = "Rubrica di " + nomeUtente + "\n";
        for (Contatto contatto : contatti) {
            stringa += contatto.toString() + "\n";
        }
        return stringa;
    }
}
