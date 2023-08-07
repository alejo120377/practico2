/*1) Realizar un programa en Java que reciba dos números enteros y los ordene
        de forma descendente. Ejemplo:*/
import java.util.Scanner;

public class ejerc1 {
    public static void main(String[] args) {
        int numa;
        int numb;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE un numero:"+"  ");
        numa = in.nextInt();
        System.out.print("INGRESE otro numero:"+"  ");
        numb = in.nextInt();
        if (numa > numb) {
            System.out.print("NUMEROS ORDENADOS:"+"     "+numa +"  , " +numb);
        } else {
            System.out.print("NUMEROS ORDENADOS :"+"   " +numb+ "  , " +numa);
        }
    }
}

