
/*13) Realizar un programa en Java que dibuje un triángulo rectángulo de n
        elementos de lado (catetos iguales). n = 4:*/

import java.util.Scanner;


public class ejerc13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("dame num");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("   *   ");

        }
        System.out.println("\n");
        for (int i = 2; i <= (n); i++) {

            System.out.print("   *   ");

        }
        System.out.println("\n");
        for (int i = 3; i <= (n); i++) {

            System.out.print("   *   ");
        }

        System.out.println("\n");
        for (int i = 4; i <= (n); i++) {

            System.out.print("   *   ");
        }


    }
}




