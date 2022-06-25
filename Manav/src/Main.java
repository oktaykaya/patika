
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String Manav = "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL";

        System.out.println(Manav);

        Scanner scanner = new Scanner(System.in);


            System.out.print("Armutdan kaç kilo istediğinizi giriniz : ");
            int armutkilo = scanner.nextInt();
            double armutfiyat = armutkilo*2.14;

        System.out.print("Elma kaç kilo istediğinizi giriniz : ");
        int elmakilo = scanner.nextInt();
        double elmafiyat = armutkilo*3.67;

        System.out.print("Domates kaç kilo istediğinizi giriniz : ");
        int domateskilo = scanner.nextInt();
        double domatesfiyat = armutkilo*1.11;

        System.out.print("Muz kaç kilo istediğinizi giriniz : ");
        int muzkilo = scanner.nextInt();
        double muzfiyat = armutkilo*0.95;

        System.out.print("Patlıcan kaç kilo istediğinizi giriniz : ");
        int patlıcankilo = scanner.nextInt();
        double patlıcanfiyat = armutkilo*5;


        double toplam = armutfiyat+elmafiyat+domatesfiyat+muzfiyat+patlıcanfiyat;

        System.out.println("toplam alışveriş tutarı : " + toplam);


    }
}
