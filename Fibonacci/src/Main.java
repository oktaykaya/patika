import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int fibo ;
        System.out.print("fibonacci serisi kaç basamaklı olsun : ");
        fibo = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" " +b+ " ");
        for(int i = 1; i<=fibo-2; i++){

            c = a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
    }
}
