import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("lütfen bir sayı giriniz : ");
        number = scanner.nextInt();
        int n =1;
        double result = 0;
        for (int i=1; i<=number;i++){
            result += 1.0/n;
            n++;
        }
        System.out.println(result);

    }
}
