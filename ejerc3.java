/*3) Realizar un programa en Java que reciba la hora en forma de horas, minutos
        y segundos. Se deberá mostrar por pantalla, la hora ingresada 1 segundo
        mas tarde:*/


import java.util.Scanner;
/*3) Realizar un programa en Java que reciba la hora en forma de horas, minutos
        y segundos. Se deberá mostrar por pantalla, la hora ingresada 1 segundo
        mas tarde:*/
public class ejerc3 {
    public static void main(String[] args) {
        int hora;
        int minuto;
        int segundo ;
        int segundos ;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE HORA:" + "  ");
        hora = in.nextInt();
        System.out.print("INGRESE MINUTO:" + "  ");
        minuto = in.nextInt();
        System.out.print("INGRESE SEGUNDO:" + "  ");
        segundo = in.nextInt();
        System.out.print("-------------------------------------------------------------------------------------------\n");

        System.out.println("La hora ingresada fue " + hora + ":" + minuto + ":" + segundo);
        segundos = (segundo + 1);

        if (segundos > 59) {

            minuto = minuto + 1;
            segundos=segundos - 60;
        }

            if (minuto > 59) {
                hora = hora +1;
                minuto = minuto - 60;
            }
            if (hora > 23 ){
               hora = hora -24;
            }

            System.out.println("La hora ingresada fue " + hora + ":" + minuto + ":" + segundos);
        }
    }
