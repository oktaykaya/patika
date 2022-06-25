import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz :");
        int sayi = scanner.nextInt();
        System.out.println("kdv'siz fiyat : " + sayi);

        double kdv =0.18;

        double kdvli = sayi+(sayi * kdv);

        System.out.println("kdv'li fiyat : "+ kdvli);

        double kdvmiktari = sayi * kdv;

        System.out.println("kdv tutarı : " + kdvmiktari);
    }
}
