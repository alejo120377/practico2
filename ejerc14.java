
/*Realizar un programa en Java, que pida valores entre 0 y 32,1 hasta que se
        le ingrese un número negativo. Por cada valor ingresado se calculará su raíz
        cuadrada. Al ingresar un número negativo se mostrará la suma del resultado
        de las raíces cuadradas, el promedio de los números ingresados y un
        mensaje de despedida, cerrando el programa. En caso de ingresar un
        número mayor a 32,1 se deberá de volver a pedir el dato sin calcular nada*/





import java.util.Scanner;

public class ejerc14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float c;
        c = 1;
        double acum = 0;
        double prom = 0;
        int cont = 1;

        while (c > 0) {
            System.out.print(" ingrese numero:");
            c = in.nextFloat();

            double resultadoRaiz;


            if (c > 0 && c < 32.1) {
                resultadoRaiz = Math.sqrt(c);
                acum = resultadoRaiz + acum;
                prom = acum / cont;
                System.out.println(resultadoRaiz);
                 System.out.println(+cont);
                 cont = cont + 1;

            }
            if (c < 0) {
                System.out.print("el promedio es:" + prom);
                System.out.println("\n la sumatoria de raices es:"+acum);
                System.out.println("\n---------------------------------- salir-----------------------------------");
            }


        }

    }
}