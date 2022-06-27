import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int number = scanner.nextInt();
        int m = 1;
        for (int i = 1; i<=number; i*=4){

            System.out.println("4'ün " + m+" inci katsayısı : " +i);
            m++;
        }
        m=1;

        System.out.println("**************************************************");

        for (int k = 1; k<=number; k*=5){
            System.out.println("5'in " + m+" inci katsayısı : " +k);
            m++;
        }

    }
}
