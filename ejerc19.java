
/*19) Realizar una función que reciba 3 números enteros y devuelva el máximo de
        ellos*/

import java.util.Scanner;

public class ejerc19 {

 public static void main(String[] args) {
     int a;
     int b;
     int c;
     int mayor = 0;
     Scanner in = new Scanner(System.in);

     System.out.println(" ingrese a");
     a = in.nextInt();

     System.out.println(" ingrese b");
     b = in.nextInt();

     System.out.println(" ingrese c");
     c = in.nextInt();
     mayor = mayor(a, b,c, mayor);
     System.out.println("el mayor es:\t" + mayor);
 }
    public static int  mayor(int a, int b,int c ,int mayor) {
        mayor=0;
        if(a>b&&a>c){
            mayor=a;
            // System.out.println(b);
        }if(b>a&&b>c) {
            mayor=b;
            // System.out.println(a);
        }if(c>a&&c>b){
            mayor=c;
        }




        return mayor;
    }

}