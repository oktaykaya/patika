import java.util.Scanner;

//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        boolean dongu= true;
        while (dongu){
            System.out.print("sayı giriniz : ");
            int sayi = scanner.nextInt();

            int kalan = sayi%2;

            if (kalan == 1){
               dongu = false;
            }

            else if (sayi%4 == 0){
                toplam += sayi;
            }


        }
        System.out.println("4 bölünen çift sayıların toplamı : " +toplam);
    }
}
