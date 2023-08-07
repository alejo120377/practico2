

/*11)Realizar un programa en Java que calcule NX (ejemplo: 23 = 2 * 2 * 2 = 8). El
        programa deberá realizar el cálculo y preguntar al usuario si quiere repetir el
        programa:*/


import java.util.Scanner;
public class ejerc11 {

    public static void main(String[] args) {
        while (true) {
        Scanner sc = new Scanner(System.in);
        float n=0;
        float x=0;
        char caracter ='s';
        float r = 1;

            if (caracter == 's') {
                System.out.print("ingrese base(n):");
                n = sc.nextFloat();
                System.out.print("ingrese exponente(x):");
                x = sc.nextFloat();
                for (int a = 0; a < x; a++) {
                    r = r * n;
                    a = a++;
                    //  System.out.print(n);
                    // System.out.print("*");
                }
                System.out.println("resultado=" + r);
                System.out.println("desea repetir ? <s/n>");

                caracter = sc.next().charAt(0);
            } else{
                System.out.println("-----------fin del programa--------");
                break;

            }

        }



    }
}