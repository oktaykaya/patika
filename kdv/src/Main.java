import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz :");
        double sayi = scanner.nextDouble();
        double kdvorani;
        if (sayi < 1000){
            kdvorani = 0.18;
            System.out.println("kdv'siz fiyat = " +sayi);

            double kdvli = sayi+ sayi*kdvorani;
            System.out.println("kdv'li fiyat = " +kdvli);

            double kdvtutari = sayi*kdvorani;
            System.out.println("kdv orani = " +kdvtutari);
        }
        else{
            kdvorani = 0.08;
            System.out.println("kdv'siz fiyat = " +sayi);

            double kdvli = sayi+ sayi*kdvorani;
            System.out.println("kdv'li fiyat = " +kdvli);

            double kdvtutari = sayi*kdvorani;
            System.out.println("kdv orani = " +kdvtutari);
        }
    }
}
