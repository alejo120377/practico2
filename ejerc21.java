/*21) Realizar una función que devuelva true si el número entero pasado por
        parámetro es primo, si no lo es , devuelve false*/


import java.util.Scanner;

public class ejerc21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int i = 1;

        int c = 0;
        int n;
        System.out.print("dame numa:");

        n = in.nextInt();
        boolean opcion = primo( n,  c,  i);
        System.out.println("es primo?:\t"+opcion);
    }

    public static boolean primo(int n, int c, int i) {
        boolean opcion;

        while (i <= n) {
                if (n % i == 0) {

                    c++;
                }

                i++;

            }

            if (c == 2) {
                //System.out.println("es primo");
                 opcion =true;
            } else {
                //System.out.println("no es primo ");
                  opcion = false ;
            }
        return opcion;



        }
}







