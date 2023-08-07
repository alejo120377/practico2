
/* 7) Realizar un programa en Java que muestre la suma de los números, del 1 al
ingresado por el usuario. El programa termina cuando se ingresa 0.
Mostrar en consola la operación, ejemplo:  */


import java.util.Scanner;
public class ejerc7{
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        int c;
        int acum = 0;
        System.out.print(" ingrese numero:");
        c = in.nextInt();
        while (c != 0) {
            for (int contador = 1; contador <= c; contador++) {
                acum = acum + contador;
                //  contador=contador +1;

                //  System.out.print("+");

                System.out.print(contador);
                if (contador < c) {
                    System.out.print("+");
                }

            }c=0;

            System.out.print("=");
            System.out.print(acum);
        }



    }
}



