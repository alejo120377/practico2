/*20) Realizar una función que reciba un carácter y devuelve false si no es vocal, y
        true si es vocal.*/
import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {

        System.out.println("ingrese caracter");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char x = s.charAt(0);

 boolean vocal=vocal( x);
        System.out.println("el caracter es vocal?:\t\n"+vocal);

    }public static boolean vocal(char x){
        boolean vocal;

        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            vocal=true;
        }else{
            vocal = false;
        }


        return vocal;
    }

}
