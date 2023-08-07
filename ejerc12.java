
/*2) Realizar un programa en Java que detecte números primos. El programa
        seguirá pidiendo números hasta ingresar un número menor a 0*/

import java.util.Scanner;

public class ejerc12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


while(true) {
    int i = 1;

    int c = 0;
    int n ;

    System.out.print("dame numa:");

    n = in.nextInt();
    if (n > 0) {
        while (i <= n) {
            if (n % i == 0) {

                c++;
            }

            i++;

        }

        if (c == 2) {
            System.out.println("es primo");

               } else {
            System.out.println("no es primo ");

               }
             }else {
        System.out.println("---------------------------fin----------------------------");
               break;


        }
      }
    }
}