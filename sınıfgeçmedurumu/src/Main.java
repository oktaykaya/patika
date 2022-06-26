import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int dersSayisi  =0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen matematik notunuzu giriniz : ");
        mat = scanner.nextInt();

        if (mat==100 || mat==0){
            mat = 0;
        }
        else {
            dersSayisi++;
        }

        System.out.print("lütfen fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();

        if (fizik==100 || fizik==0){
            fizik = 0;
        }
        else {
            dersSayisi++;
        }

        System.out.print("lütfen turkce notunuzu giriniz : ");
        turkce = scanner.nextInt();

        if (turkce==100 || turkce==0){
            turkce = 0;
        }
        else {
            dersSayisi++;
        }

        System.out.print("lütfen kimya notunuzu giriniz : ");
        kimya = scanner.nextInt();

        if (kimya==100 || kimya==0){
            kimya = 0;
        }
        else {
            dersSayisi++;
        }

        System.out.print("lütfen muzik notunuzu giriniz : ");
        muzik = scanner.nextInt();

        if (muzik==100 || muzik==0){
            muzik = 0;
        }
        else {
            dersSayisi++;
        }

       double avarage = (mat+fizik+kimya+turkce+muzik)/dersSayisi;

        if (avarage <= 55){
            System.out.println("sınıfı geçemediniz, seneye tekrar görüşmek üzere");
        }
        else {
            System.out.println("tebrikelr sınıfı geçtiniz");
        }
        System.out.println("not ortalamanız : " + avarage);
    }

}
