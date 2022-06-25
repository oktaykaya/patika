import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen dairenin yarıçapını veriniz : ");
        double r = scanner.nextInt();
        double pi = 3.14;
        double dairealan= pi*r*r;
        double cevre = 2*pi*r;
        System.out.println("lütfen dairenin merkezaçısını veriniz : ");
        double merkezaci= scanner.nextDouble();

        double dairealani= (pi*(r*r)*merkezaci)/360;

        System.out.println("dairenin alanı : " + dairealani);
    }
}
