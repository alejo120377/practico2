
/*6) Realizar un programa en Java, que genere a partir de un número entero de 8
        dígitos, un código con la siguiente lógica: Según el resto 23 del número
        ingresado concatenar una letra al número ingresado según la tabla:
        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
        A Q Z S X W D C E F V R G T B H Y N U M I L O*/
import java.util.Scanner;


public class ejerc6 {
    public static void main( String [] args) {
        int resto;
        int numa;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE un numero:");
        numa = in.nextInt();

        resto = numa % 23;


        System.out.println(+resto);
        switch (resto) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("Q");
                break;
            case 2:
                System.out.println("Z");
                break;
            case 3:
                System.out.println("S");
                break;
            case 4:
                System.out.println("X");
                break;
            case 5:
                System.out.println("W");
                break;
            case 9:
                System.out.println("F");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("E");
                break;
            case 10:
                System.out.println("V");
                break;
            case 11:
                System.out.println("R");
                break;

            case 12:
                System.out.println("G");
                break;
            case 13:
                System.out.println("T");
                break;
            case 14:
                System.out.println("B");
                break;

            case 15:
                System.out.println("H");
                break;
            case 16:
                System.out.println("Y");
                break;
            case 17:
                System.out.println("N");
                break;
            case 18:
                System.out.println("U");
                break;
            case 19:
                System.out.println("M");
                break;
            case 20:
                System.out.println("I");
                break;
            case 21:
                System.out.println("L");
                break;
            case 22:
                System.out.println("O");
                break;

        }
    }
}



