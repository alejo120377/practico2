/*10)Realizar un programa en Java que que lea un operando (número), un
       operador (carácter) y otro operando (número), y muestr+e el resultado de la
        operación correspondiente (operadores: +, ‐,* y /). El programa seguirá
        pidiendo operaciones hasta que el primer operando sea 0.*/


import java.util.Scanner;
public class ejerc10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int op1 ;
        int resu = 0;
        int op2 ;
        while (true) {
        System.out.println("ingrese operando,operador,operando:");

        op1 = in.nextInt();

           if (op1==0){

               System.out.println("---------------fin del programa-------------------");
                         break;
               }
                   char caracter;
                    caracter = sc.next().charAt(0);

                        op2 = in.nextInt();
                         System.out.println("_________");





                switch (caracter) {
                    case '+':
                        resu = op1 + op2;
                        break;
                    case '-':
                        resu = op1 - op2;
                        break;
                    case '/':
                        resu = op1 / op2;
                        break;
                    case '*':
                        resu = op1 * op2;
                        break;

                    default:
                        System.out.println("error en la opcion");
                   }

            System.out.println("resultado:" + resu);

                }


            }


}




