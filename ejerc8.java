
/*8) Realizar un programa en Java que halle cuántos múltiplos de N hay en un
rango de números. Terminar el programa cuando se ingrese numero inicial o
final menor o igual a 0:        */


import java.util.Scanner;
public class ejerc8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
int inicio;
        int n;
        int ini;
        int acum = 0;
        int fin;

        while (true) {
            System.out.print(" ingrese inicio:");
            inicio = in.nextInt();



            System.out.print(" ingrese fin:");
            fin = in.nextInt();


            if (inicio > 0 && fin > 0 ) {

                System.out.print(" ingrese n (multiplo):");
                n = in.nextInt();

                for (ini = inicio; ini <= fin; ini++) {
                    if(ini%n==0) {
                        acum++;
                        System.out.print(" " + ini + " ");


                    }


                }

                System.out.println("\n cantidad:" + "" + acum);

            } else {



                System.out.println("-------------------------------------fin del programa-------------------------------");
                break;
            }
        }
    }

}


