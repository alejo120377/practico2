
/*5) Realizar un programa en Java que ingresando un número entero entre 1 y 99,
        lo muestre por pantalla escrito:*/
import java.util.Scanner;
public class ejerc5 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numa;
        int decenas;
        int unidades;



        System.out.print("dame numa:");
        numa = in.nextInt();

        decenas = numa / 10;
        unidades = numa % 10;

        // System.out.println(" " + decenas + unidades);

        if (numa >= 10 && numa < 15) {

            switch (numa) {

                case 10:
                    System.out.println(" diez ");
                    break;
                case 11:
                    System.out.println(" once ");
                    break;
                case 12:
                    System.out.println(" doce ");
                    break;
                case 13:
                    System.out.println(" trece ");
                    break;
                case 14:
                    System.out.println(" catorce");
                    break;
                case 15:
                    System.out.println(" quince ");
                    break;
            }
        } else {


            switch (decenas) {
                case 1:
                    System.out.print("dieci");
                    break;

                case 2:
                    System.out.print("veinte");
                    break;


                case 3:
                    System.out.print("treinta ");
                    break;


                case 4:
                    System.out.print("cuarenta ");
                    break;


                case 5:
                    System.out.print("cincuenta ");
                    break;


                case 6:

                    System.out.println("sesenta ");
                    break;


                case 7:
                    System.out.print("setenta ");
                    break;


                case 8:
                    System.out.print("ochenta ");
                    break;


                case 9:

                    System.out.print("noventa");
                    break;
            }


            if (decenas != 0 && decenas != 1 && unidades != 0) {


                System.out.print(" y ");
            }
if( unidades <= 9) {
    switch (unidades) {
        case 0:
            if( unidades==0 && numa !=10 ){
                System.out.print("cero");
            }

            break;
        case 1:
            System.out.print("uno ");

            break;
        case 2:

            System.out.print("dos ");
            break;
        case 3:
            System.out.print("tres ");
            break;
        case 4:
            System.out.print("cuatro");
            break;
        case 5:
            System.out.print("cinco ");
            break;

        case 6:
            System.out.print("seis");
            break;

        case 7:
            System.out.print("siete");
            break;
        case 8:
            System.out.print("ocho");
            break;

        case 9:
            System.out.print("nueve");
            break;

            }
          }
        }
    }

}





