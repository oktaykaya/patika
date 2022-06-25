import java.util.Scanner;

public class Hipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kenar1, kenar2;

        System.out.println("lütfen 1. kenarın uzunluğunu giriniz : ");
        kenar1= scanner.nextInt();

        System.out.println("lütfen 2. kenarın uzunluğunu giriniz : ");
        kenar2= scanner.nextInt();

        double kenar3 = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("hipotenüs : " +kenar3);

        double cevre = kenar1+kenar2+kenar3;

        System.out.println("üçgenin çevresi : "+ cevre);
        double u = cevre/2;

        double alankare = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        double alan = Math.sqrt(alankare);
        System.out.println("üçgenin alanı = " +alan);


    }
}
