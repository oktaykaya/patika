import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("lütfen bir yıl giriniz : ");
        int yil = scanner.nextInt();

        int kalan = yil%4;
        int kalanyuzyil= yil%400;
        int kalanyuz=yil%100;

        if (kalanyuz == 0 && kalanyuzyil != 0){
            System.out.println(yil+" artık yıl değildir");
        }
        else if (kalan == 0){
            System.out.println(yil+" artık yıldır");
        }
        else {
            System.out.println(yil+" artık yıl değildir");
        }
    }
}
