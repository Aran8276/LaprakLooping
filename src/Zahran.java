// Zahran Zaidan Nasution - 265150601111020
import java.util.Scanner;

public class Zahran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ukuran = 6;

        // Cetak Z:
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                for (int j = 1; j <= ukuran; j++) {
                    System.out.print('Z');
                }
                System.out.println();
                continue;
            }

            if (i == 2) {
                for (int j = 1; j < ukuran + 1; j++) {
                    for (int k = ukuran - 1; k >= j; k--) {
                        System.out.print(" ");
                    }

                    System.out.print("Z");

                    for (int k = 1; k <= j; k++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            if (i == 3) {
                for (int j = 1; j <= ukuran; j++) {
                    System.out.print('Z');
                }
                System.out.println();
                continue;
            }
        }

        // Cetak A
        for (int i = 1; i <= ukuran; i++) {
            for (int l = ukuran; l >= i + 1; l--) {
                System.out.print(" ");
            }


            if (i == (ukuran - 2)) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("A ");
                }
                System.out.println();
                continue;
            }

            if (i == ukuran) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        System.out.print("A ");
                        continue;
                    }

                    if (j == i) {
                        System.out.print("A ");
                        continue;
                    }

                    System.out.print("  ");
                }
                System.out.println();
                continue;
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("A ");
                    continue;
                }

                if (j == i) {
                    System.out.print("A ");
                    continue;
                }

                System.out.print("  ");
            }

            System.out.println();
        }

        // Cetak H
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                if (j == 1) {
                    System.out.print("H ");
                    continue;
                }

                if (j == ukuran) {
                    System.out.print("H ");
                    continue;
                }

                if (i == ukuran / 2) {
                    System.out.print("H ");
                    continue;
                }

                System.out.print("  ");
            }

            System.out.println();
        }

        // Cetak R
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                if (j == 1) {
                    System.out.print("R ");
                    continue;
                }

                if (i == 1 || i == ukuran / 2) {
                    if (j < ukuran) {
                        System.out.print("R ");
                        continue;
                    }
                }

                if (j == ukuran && i > 1 && i < ukuran / 2) {
                    System.out.print("R ");
                    continue;
                }

                if (i > ukuran / 2 && j == i) {
                    System.out.print("R ");
                    continue;
                }

                System.out.print("  ");
            }

            System.out.println();
        }

        // Cetak A
        for (int i = 1; i <= ukuran; i++) {
            for (int l = ukuran; l >= i + 1; l--) {
                System.out.print(" ");
            }

            if (i == (ukuran - 2)) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("A ");
                }
                System.out.println();
                continue;
            }

            if (i == ukuran) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        System.out.print("A ");
                        continue;
                    }

                    if (j == i) {
                        System.out.print("A ");
                        continue;
                    }

                    System.out.print("  ");
                }
                System.out.println();
                continue;
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("A ");
                    continue;
                }

                if (j == i) {
                    System.out.print("A ");
                    continue;
                }

                System.out.print("  ");
            }

            System.out.println();
        }

        // Cetak N
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                if (j == 1) {
                    System.out.print("N ");
                    continue;
                }

                if (j == ukuran) {
                    System.out.print("N ");
                    continue;
                }

                if (j == i) {
                    System.out.print("N ");
                    continue;
                }

                System.out.print("  ");
            }

            System.out.println();
        }
    }
}