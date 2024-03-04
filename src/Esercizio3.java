import java.util.Scanner;

public class Esercizio3 {
    public static void  main(String[] args){
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        double latoR1=Double.parseDouble(scanner.nextLine());
        double latoR2=Double.parseDouble(scanner.nextLine());

double risultatoPerimetroRettangolo = perimetroRettangolo(latoR1, latoR2);
        System.out.println(risultatoPerimetroRettangolo);
int numero1 = 4;
int numero2 = 5;
        System.out.println("il numero " + numero1 + " è " + (pariDispari(numero1)));
        System.out.println("il numero " + numero2 + " è " + (pariDispari(numero2)));

        double lato1= Double.parseDouble(scanner.nextLine());
        double lato2= Double.parseDouble(scanner.nextLine());
        double lato3= Double.parseDouble(scanner.nextLine());
        double area= perimetroTriangolo(lato1, lato2, lato3);
        System.out.println("l'area del triangolo è: " + area);
    }

    public static double perimetroRettangolo(double num1, double num2){
        return num1 * 2 + num2 * 2;
    }

    public static int pariDispari(int num){
        return num % 2 == 0 ? 0 : 1;
    }
    public static double perimetroTriangolo(double num1, double num2, double num3){
        double semiPerimetro= (num1+num2+num3) / 2;
        return Math.sqrt(semiPerimetro*(semiPerimetro-num1)*(semiPerimetro-num2)*(semiPerimetro-num3));

    }

    }
