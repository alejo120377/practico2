
//18) Realizar una función que reciba 2 números y devuelva el máximo de ellos

import java.util.Scanner;

public class ejerc18 {
    public static void main(String[] args) {
        int a;
        int b;
       int mayor=0 ;
        Scanner in = new Scanner(System.in);

        System.out.println(" ingrese a");
        a = in.nextInt();

        System.out.println(" ingrese b");
        b = in.nextInt();

        mayor = mayor(a, b, mayor);
        System.out.println("el mayor es:\t"+mayor);
    }
    

    public static int  mayor(int a, int b,int mayor) {
         mayor=0;
        if(a<b){
            mayor=b;
           // System.out.println(b);
        }else {
            mayor=a;
           // System.out.println(a);
        }




        return mayor;
    }

}
