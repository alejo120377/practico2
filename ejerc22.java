
/*22) Realizar una función que se llama calculadora, que recibe como parámetro
        dos valores reales (operandos) y un string “suma”, “resta” , “división”,
        “multiplicación”. Según estos parámetros devolver el resultado de la
        operación. En caso de recibir un String que no coincida con ninguna de las
        operaciones, devolver 0*/
import java.util.Scanner;

public class ejerc22 {
    public static void main(String[] args) {
int resultado=0;

        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println(" ingrese a");
    int    a = in.nextInt();

        System.out.println(" operacion");
        String operacion = sc.nextLine();
        
        System.out.println(" ingrese b");
     int    b = in.nextInt();

       
         resultado=calculadora(a,b,operacion,resultado);
        System.out.println("resultado:"+resultado);

    } public static  int  calculadora(int a, int b, String operacion,int resultado ) {
        switch (operacion) {
            case "suma":
                resultado = a + b;

                break;
            case "resta":

                resultado = a - b;
                break;
            case "multiplicacion" :
                resultado = a * b;
                break;

            case "division" :
                resultado = a / b;

                break;
        }return resultado;
    }




}
