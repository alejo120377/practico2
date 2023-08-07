

      /*  17) Realizar una función que teniendo como parámetro dos números enteros,
        muestre los que hay entre ellos.*/

      import java.util.Scanner;
public class ejerc17 {
    public static void main(String[] args) {
int a;
int b;
Scanner in = new Scanner(System.in);

        System.out.println(" ingrese a");
        a = in.nextInt();

        System.out.println(" ingrese b");
        b = in.nextInt();
        int contador;
        contador = Contador(a, b);

        System.out.print( " "+contador);


    }

    private static int Contador(int a, int b) {

int contador =0;






        for(contador =(a+1); contador<(b-1) ;contador++) {
                  contador=contador++;
            System.out.print( " "+contador);



        }

        return contador;

     }
    }

