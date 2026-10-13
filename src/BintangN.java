// Zahran Zaidan Nasution - 265150601111020
import java.util.Scanner;

public class BintangN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("Masukkan nilai n = ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int l = n; l >= i + 1; l--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
