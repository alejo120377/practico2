
/*15) Realizar una función que se llame eco. Recibe por parámetro la cantidad de
        veces que se mostrará el mensaje “Eco…” por pantalla*/

import java.util.Scanner;

public class ejerc15 {
    public static void main(String[] args) {
        int n=0;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE CANTIDAD DE ECOS:\n");
        n = in.nextInt();
    int  eco= eco( n);

    }
    public static char eco(int n){
char eco=0;
   //Scanner in = new Scanner(System.in);
       // System.out.print("dame numa:");
   // n = in.nextInt();

     while (n>0) {

         System.out.println("eco..");
         n = n - 1;
     }
     return eco;
    }
}
















