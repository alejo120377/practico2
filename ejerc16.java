
/*16) Realizar una función igual a la del punto 15, pero que recibe dos
        argumentos, el segundo con el mensaje a mostrar*/


import java.util.Scanner;

public class ejerc16 {

    public static void main(String[] args) {
        int n=0;
        String m;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESE CANTIDAD DE ECOS:\n");
        n = in.nextInt();
        System.out.print("INGRESE msj:\t");
        m = sc.nextLine();

      char eco= eco( n, m);

    }
    public static char eco(int n, String m){
        char eco=0;
        //Scanner in = new Scanner(System.in);
        // System.out.print("dame numa:");
        // n = in.nextInt();

        while (n>0) {

            System.out.println("eco..:\t"+m);
            n = n-1 ;
        }

        return eco;
    }
}










