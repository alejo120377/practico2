/*2) Realizar un programa en Java que reciba 3 números enteros y los ordene de
        forma ascendente.*/


import java.util.Scanner;

public class ejerc2 {
    public static void main(String[] args) {
        int numa ;
        int numb ;
        int numc;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE un numero:" + "  ");
        numa = in.nextInt();
        System.out.print("INGRESE otro numero:" + "  ");
        numb = in.nextInt();
        System.out.print("INGRESE otro numero:" + "  ");
        numc = in.nextInt();
        if (numa > numb) {

            if (numb > numc) {

                System.out.println("numeros ordenados:\n" + numc + " , " + numb + " , " + numa);
                       } else if(numc<numa){
                System.out.println("numeros ordenados:\n" + numb + " , " + numc + " , " + numa);
                    }else{
                System.out.println("numeros ordenados:\n" + numb + " , " + numa + " , " + numc+"\n");
                System.out.print("                                                                              \n\n\t");

            }



                 } else if (numb < numc) {

                System.out.println("numeros ordenados:\n" + numa + " , " + numb + " , " + numc);

               } else if (numa < numc) {
                System.out.println("numeros ordenados:\n" + numa + " , " + numc + " , " + numb);
              }else{
            System.out.println("numeros ordenados:\n" + numc + " , " + numa + " , " + numb);
           }



        }
    }

