import java.util.Scanner;

public class ejerc121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;

        int c = 0;
        int n;


            System.out.print("dame numa:");

            n = in.nextInt();

    while (i <= n) {
        if (n % i == 0) {

            c++;
        }

        i++;

    }

    if (c == 2) {
        System.out.println("es primo");

    } else {
        System.out.println("no es primo ");

    }


    }
}