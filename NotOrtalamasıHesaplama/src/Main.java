import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımladık
        int  mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı tanımla
        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan girdileri al

        System.out.println("lütfen matematik notunuzu giriniz : ");
        mat = scanner.nextInt();

        System.out.println("lütfen fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();

        System.out.println("lütfen kimya notunuzu giriniz : ");
        kimya = scanner.nextInt();

        System.out.println("lütfen turkce notunuzu giriniz : ");
        turkce = scanner.nextInt();

        System.out.println("lütfen tarih notunuzu giriniz : ");
        tarih = scanner.nextInt();

        System.out.println("lütfen muzik notunuzu giriniz : ");
        muzik = scanner.nextInt();

        // not ortalamasını bul

        double ortalama = (mat+fizik+kimya+tarih+turkce+muzik)/6.0;

        System.out.println("dönem ortalamanız :" + ortalama);

        boolean gectimi = ortalama >=60;
        String not = gectimi ? "Sınıfı Geçti" : "sınfta kaldı";

        System.out.println(not);


    }
}
