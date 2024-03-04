import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("ciao");

        // numeri interi

        boolean x = true;
        x = false;
        byte numeroPiccolo = 100;
        short numeroNonProprioPiccolo = 1000;
        int numeroIntero = 40000;
        long numeroGrande = 1000000000;

        numeroIntero = numeroPiccolo; // esempio di casting implicito
        System.out.println("Numero intero : " + numeroIntero);

        numeroPiccolo = (byte) numeroGrande; // esempio di casting esplicito <-- attenzione può portare a perdite di dati
        System.out.println("Numero piccolo : " + numeroPiccolo);

        // numeri decimali

        double numeroDecimale = 0.5;
        float altroNumeroDecimale = 0.5f;
        // Sia i double che i float rappresentano numeri decimali. Come regola generale meglio usare sempre i double per questioni di rapidità nell'esecuzione sui processori moderni

        System.out.println(numeroDecimale);

        // stringhe

        char singoloCarattere = 'M';
        String stringa = "hello world";
        //stringa = String.valueOf(2);

        System.out.println(stringa);
        System.out.println("La lunghezza della stringa è: " + stringa.length());
        System.out.println("Il primo carattere della stringa è: " + stringa.charAt(0));
        System.out.println(stringa.replaceAll("world", "mondo"));

        // arrays

        String[] arrayDiStringhe = {"ciao", "a", "tutti"};
        // String[ arrayDiStringhe = new String[3]; Array di elementi non inizializzato (gli elementi sono null)
        int[] arrayDiInteri = {1, 2, 3, 4, 5, 6};

        System.out.println("il primo elemento è: " + arrayDiStringhe[0]);
        System.out.println("il secondo elemento è: " + arrayDiStringhe[1]);


        for (int i = 0; i < arrayDiInteri.length; i++) {
            System.out.println("elemento corrente: " + arrayDiInteri[i]);
            System.out.println("indice corrente: " + i);
        }

        // metodi
        int risultato = sum(2, 5);
        System.out.println("la somma è: " + risultato);
        printSum(2, 7);
        String risultatoStringa = sumAsString(3, 7);
        System.out.println("la somma è: " + risultatoStringa);

        // scanner
        Scanner scanner = new Scanner(System.in); // inizializzazione scanner, questo è uno strumento utile per richiedere l'input agli utenti
        // system.in vuol dire leggi gli input dal terminale


        System.out.println("caro utente, per favore inserisci il tuo nome seguito dal tasto invio");

        String name = scanner.nextLine(); // attendo che l'utente scriva il proprio nome, una volta fatto salverò tale varole in una variabile di tipo String
        System.out.println("hai inserito " + name);
        System.out.println("ora inserisco un numero intero");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("ora inserisco un seconddo numero intero");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("la somma è: " + sum(numero1, numero2));


    }
        public static int sum(int num1, int num2){// questo metodo dovrà tornare un int
            return num1 + num2;
        }

        public static void printSum(int num1, int num2){// questo metodo invece non torna niente (void)
            System.out.println("la somma è: " + (num1 + num2));
        }

        public static String sumAsString(int num1, int num2) {
        return "" + (num1 + num2);
        }

}