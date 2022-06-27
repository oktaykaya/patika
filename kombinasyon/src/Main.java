import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen istediğiniz kombinasyomnun değerlerini giriniz (C(n,r)) : ");
        System.out.println("r n den küçük olmalı");
        System.out.print("n : ");
        int n = scanner.nextInt();
        System.out.print("r : ");
        int r = scanner.nextInt();
        int toplamn = 1;
        int toplamm = 1;
        int fark = n-r;
        int farkt = 1;

        for (int i = 1; i<=n; i++){
            toplamn *= i;
        }

        for (int i=1; i<=r; i++){
            toplamm *=i;
        }

        for (int i=1; i<=fark; i++){
            farkt *=i;
        }

        double kombinasyon = toplamn/(toplamm*farkt);
        System.out.println("C("+n+","+r+") kombinasyonu : " +kombinasyon);

    }
}
