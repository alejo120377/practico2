import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        final int LONGITUD= 13;
        int acu = 0;
        int indice;
        int numeros[] = new int[LONGITUD];
        Scanner in = new Scanner(System.in);
        
        for ( indice = 0; indice <numeros.length;indice++) {
            System.out.print("ingrese num\n");

            numeros[indice] = in.nextInt();
            acu = acu + numeros[indice];
            System.out.printf("%s%8s\n","indice", "valor"+numeros[indice]);
            System.out.println("acu"+acu);

        }

       // for(; indice < numeros.length;indice++)
           System.out.printf("%5d%8d\n", indice , numeros[indice]);
    }
  }

