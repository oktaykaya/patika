import java.util.Scanner;
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int max =1, min =1;
        int counter;
        System.out.print("lütfen kaç tane sayı gireceğinizi yazınız : ");
        int number = scanner.nextInt();

        for (int i =1; i<=number; i++){
            System.out.print(i+". sayıyı giriniz : ");
            counter=scanner.nextInt();

            if (counter > max){
                max = counter;
            }
            if (counter<min){
                min = counter;
            }
        }
        System.out.println("en büyük sayı : " + max);
        System.out.println("en küçük sayı : " + min);
    }
}
