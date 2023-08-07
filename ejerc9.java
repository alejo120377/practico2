
/*Realizar un programa en Java que dado un rango de números enteros
        positivos, muestre la cantidad de números pares entre ellos. Terminar el
        programa cuando se ingrese numero inicial o final menor a 0 :*/


import java.util.Scanner;
public class ejerc9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inicio;
        int ini;
        int acum = 0;
        int fin;

        while (true) {
            System.out.print(" ingrese inicio:");
            inicio = in.nextInt();



                System.out.print(" ingrese fin:");
                fin = in.nextInt();
            if (inicio > 0 && fin > 0 ) {

                for (ini = inicio; ini <= fin; ini++) {
                    if (ini % 2 == 0) {
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

