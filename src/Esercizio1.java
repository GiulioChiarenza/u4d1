import java.util.Arrays;

public class Esercizio1 {
    public static void  main(String[] args){
        System.out.println("hello");

int risultatoMulti = multi(5, 10);
        System.out.println(risultatoMulti);
String risultatoConcat = sumAsString(2, 2);
        System.out.println(risultatoConcat);
String[] array ={"Primo", "Secondo", "Terzo", "Quarto", "Quinto"};
        String newString = "new";
        String[] newArray = inserisciUnArray(array, newString);

        System.out.println(Arrays.toString(newArray));



    }
    public static int multi(int num1, int num2){// questo metodo dovrà tornare un int
        return num1 * num2;
    }
    public static String sumAsString(int num1, int num2) {
        return "" + (num1 + num2);
    }
public static String[] inserisciUnArray(String[] array, String newString){
        String[] newArray =new String[6];
        System.arraycopy(array, 0, newArray, 0, 2);
        newArray[2]= newString;
        System.arraycopy(array, 2, newArray, 3, array.length - 2);

        return newArray;
}
}
