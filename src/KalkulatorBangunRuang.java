// Zahran Zaidan Nasution - 265150601111020
import java.util.Scanner;

public class KalkulatorBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection = 0;

        do {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.printf("\nMASUKKAN PILIHAN ANDA: ");
            selection = input.nextInt();

            switch (selection) {
                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                case 1:
                    int panjangBalok, lebarBalok, tinggiBalok;
                    System.out.print("panjang = ");
                    panjangBalok = input.nextInt();

                    System.out.print("lebar = ");
                    lebarBalok = input.nextInt();

                    System.out.print("tinggi = ");
                    tinggiBalok = input.nextInt();

                    System.out.println("volume balok = " + (panjangBalok * lebarBalok * tinggiBalok));
                    break;

                case 2:
                    int jarijariBola;
                    System.out.print("jarijari = ");
                    jarijariBola = input.nextInt();

                    System.out.printf("volume bola = %.2f\n", ((4.0 / 3.0) * Math.PI * Math.pow(jarijariBola, 3)));
                    break;

                case 3:
                    int jarijariKer, tinggiKer;
                    System.out.print("jarijari = ");
                    jarijariKer = input.nextInt();

                    System.out.print("tinggi = ");
                    tinggiKer = input.nextInt();

                    System.out.printf("volume kerucut = %.2f\n", ((1.0 / 3.0) * Math.PI * Math.pow(jarijariKer, 2) * tinggiKer));
                    break;

                case 4:
                    int jarijariSil, tinggiSil;
                    System.out.print("jarijari = ");
                    jarijariSil = input.nextInt();

                    System.out.print("tinggi = ");
                    tinggiSil = input.nextInt();

                    System.out.printf("volume silinder = %.2f\n", (Math.PI * Math.pow(jarijariSil, 2) * tinggiSil));
                    break;

                case 5:
                    int alasSegi, tinggiSegi, tinggiLim;
                    System.out.print("alas segitiga = ");
                    alasSegi = input.nextInt();

                    System.out.print("tinggi segitiga = ");
                    tinggiSegi = input.nextInt();

                    System.out.print("tinggi limas = ");
                    tinggiLim = input.nextInt();

                    double luasAlas = 0.5 * alasSegi * tinggiSegi;
                    System.out.printf("volume limas segitiga = %.2f\n", ((1.0 / 3.0) * luasAlas * tinggiLim));
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                    break;
            }
        } while (selection != 0);
    }
}
