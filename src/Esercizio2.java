import java.util.Scanner;

public class Esercizio2 {
    public static void  main(String[] args){
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("utente inserisci 3 nomi");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        System.out.println("hai inserito: " + name1 + name2 + name3);
        System.out.println("hai inserito: " + name3 + name2 + name1);
    }
}
