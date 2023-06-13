import classes.Contatto;
import classes.Rubrica;
import classes.Utente;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Utente utente = new Utente();
        System.out.println("Inserisci il nome dell'utente: ");
        utente.setNome(scanner.nextLine());
        System.out.println("Inserisci il cognome dell'utente: ");
        utente.setCognome(scanner.nextLine());
        System.out.println("Benvenuto " + utente.getNome() + " " + utente.getCognome() + "!");
        Rubrica rubricaCreata=utente.creaRubrica();
        while (true){
            // MENU DI OPZIONI 0 aggiungere contatto, 1 rimuovere contatto, 2 modificare contatto, 3 stampare contatti, 4 uscire
            System.out.println("Scegli un'opzione: ");
            System.out.println("0 - Aggiungi contatto");
            System.out.println("1 - Rimuovi contatto");
            System.out.println("2 - Modifica contatto");
            System.out.println("3 - Stampa contatti");
            System.out.println("4 - Esci");
            int scelta = scanner.nextInt();
            switch (scelta){
                case 0:
                    // aggiungi contatto
                    Contatto contatto=creaContatto();
                    rubricaCreata.aggiungiContatto(contatto);
                    break;
                    case 1:
                        Contatto contattoDaEliminare=recuperaContatto(rubricaCreata);
                        if (contattoDaEliminare != null){
                            rubricaCreata.rimuoviContatto(contattoDaEliminare);
                        }
                    break;
                    case 2:
                        Contatto contattoDaModificare=recuperaContatto(rubricaCreata);
                        if (contattoDaModificare != null){
                            Contatto contattoModificato=creaContatto();
                            rubricaCreata.modificaContatto(rubricaCreata.getContatti().indexOf(contattoDaModificare), contattoModificato);
                        }
                        break;
                    case 3:
                        System.out.println(rubricaCreata.toString());
                        break;

            }
        }

    }

    public static Contatto creaContatto(){
        scanner=new Scanner(System.in);
        System.out.println("Inserisci il nome del contatto: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il cognome del contatto: ");
        scanner=new Scanner(System.in);
        String cognome = scanner.nextLine();
        System.out.println("Inserisci il numero di telefono del contatto: ");
        scanner=new Scanner(System.in);
        String telefono = scanner.nextLine();
        System.out.println("Inserisci l'email del contatto: ");
        scanner=new Scanner(System.in);
        String email = scanner.nextLine();
        Contatto contatto = new Contatto(nome, cognome, telefono, email);
        return contatto;
    }

    public static Contatto recuperaContatto(Rubrica rubricaCreata){
        scanner=new Scanner(System.in);
        System.out.println("Inserisci email del contatto: ");
        String email = scanner.nextLine();
        Contatto contatto = rubricaCreata.recuperaContattoByEmail(email);
        if (contatto == null){
            System.out.println("Contatto non trovato");
        }
        return contatto;
    }
}