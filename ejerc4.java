
/*4) Realizar un programa en Java que al ingresar un número entero (int) entre 0
        y 9999, detecte si es capicua:*/
import java.util.Scanner;
public class ejerc4 {
    public static void main(String[] args) {
        int num;
        int coc;
        int coc1;
        int resu;
        int resu1;
        int coc2;
        int resu2;
     int inv;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------Detector de capicua-------------------------------");
        System.out.print("Ingrese un numero de 0 a 9999:\n               ");



        num = in.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("no esta dentro del rango");
         } else {
            if (num > 0 && num < 10) {
                System.out.println("----------------------------- no es capicua--------------------------------------");

            }
            if (num > 10 && num < 100) {
               coc= num / 10;
               resu=num % 10;
               inv=coc + resu * 10;

              if (inv==num){
                  System.out.println("----------------------------- es capicua--------------------------------------");
                }else {
                  System.out.println("--------------------------no es capicua----------------------------------------");
              }

            } else if (num > 100 && num < 1000) {
                coc= num / 100;
                resu=num % 100;
                coc1= resu / 10;
                resu1=resu % 10;
                inv=coc + coc1 * 10 + resu1 *100 ;
                if (inv==num){
                    System.out.println("----------------------------- es capicua--------------------------------------");
                }else {
                    System.out.println("--------------------------no es capicua----------------------------------------");
                }

            } else if (num > 1000 ) {


                coc= num / 1000;
                resu=num % 1000;
                coc1= resu / 100;
                resu1=resu % 100;
              coc2=  resu1/10;
              resu2=resu1%10;
                inv=coc + coc1 * 10+ coc2 *100 + resu2 *1000 ;

                if (inv == num){
                    System.out.println("----------------------------- es capicua--------------------------------------");
                }else {
                    System.out.println("--------------------------no es capicua----------------------------------------");
                }




            }
        }
    }
}