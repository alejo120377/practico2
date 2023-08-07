/*
23) Realizar un programa en java que a través de un menú repetitivo llame a 4
  de las funciones realizadas en este TP. Agregar una opción de “Salir” que
        llevará al fin del programa.*/


import java.util.Scanner;

public class ejerc23 {

    public static void main(String[] args) {
        do {
            int op;
            Scanner in = new Scanner(System.in);

            System.out.println("------------------------------------elegir opcion----------------------------------");
            System.out.println("\t  1-------------determinar cual es mayor \n\t  2-------------vericar si es primo \n\t  3------------calculadora \n\t  4------------contadora");

            System.out.println("eliga opcion");
            op = in.nextInt();

            //System.out.print("dame numa:");

            //  a = in.nextInt();
            //    Scanner in = new Scanner(System.in);
            switch (op) {
                case 1:
                int a;
                int b;
                int mayor = 0;
                System.out.println(" ingrese a");
                a = in.nextInt();

                System.out.println(" ingrese b");
                b = in.nextInt();

                mayor = mayor(a, b, mayor);
                System.out.println("el mayor es:\t" + mayor);
break;

                case 2:
                    Scanner f = new Scanner(System.in);
                    int i = 1;

                    int c = 0;
                    System.out.println(" ingrese a");
                    int a1 = f.nextInt();

                    boolean opcion = primo(a1, c, i);
                    System.out.println("es primo?:\t" + opcion);
break;


            case 3:

                    int resultado = 0;

                    /* Scanner in = new Scanner(System.in); */
                   Scanner sc = new Scanner(System.in);

                    System.out.println(" ingrese a");
                    a = in.nextInt();

                    System.out.println(" operacion");
                    String operacion = sc.nextLine();

                    System.out.println(" ingrese b");
                    b = in.nextInt();


                    resultado = calculadora(a, b, operacion, resultado);
                    System.out.println("resultado:" + resultado);


                break;


                case 4:
                   // int a;
                 //   int b;
                    Scanner h = new Scanner(System.in);

                    System.out.println(" ingrese a");
                    a = h.nextInt();

                    System.out.println(" ingrese b");
                    b = h.nextInt();
                    int contador;
                    contador = Contador(a, b);

                    System.out.println( " "+contador);






                    break;

                }


        } while (true);
    }
    private static int Contador(int a, int b) {

        int contador =0;






        for(contador =(a+1); contador<(b-1) ;contador++) {
            contador=contador++;
            System.out.print( " "+contador);



        }

        return contador;

    }
    public static  int  calculadora(int a, int b, String operacion1,int resultado ) {
        switch (operacion1) {
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


    private static boolean primo(int a1, int c, int i) {
        boolean opcion;

        while (i <= a1) {
            if (a1 % i == 0) {

                c++;
            }

            i++;

        }

        if (c == 2) {
           // System.out.println("es primo");
            opcion =true;
        } else {
          //  System.out.println("no es primo ");
            opcion = false ;
        }
        return opcion;



    }
    public static int  mayor(int a, int b,int mayor) {
        mayor=0;
        if(a<b){
            mayor=b;
            // System.out.println(b);
        }else {
            mayor=a;
            // System.out.println(a);
        }




        return mayor;
    }

}


