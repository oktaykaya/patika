import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz : ");
        int k = scanner.nextInt();
        int sayi= 0;
        int toplam = 0;

        for (int i = 1; i<= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayi++;
                toplam = toplam + i;
            }
        }
        double ortalama = toplam/sayi;
        System.out.println("ortalama : "  +ortalama);
    }
}
