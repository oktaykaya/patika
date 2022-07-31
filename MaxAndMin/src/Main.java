import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max =Integer.MIN_VALUE ;

        System.out.print("lütfen aramak istediğiniz sayıyı giriniz : ");
        int sayi = scanner.nextInt();

        Arrays.sort(list);

        for (int i : list){
            if (sayi > i){
                min = i;
            }
            if (sayi< i){
                max = i;
                break;
            }
        }
        System.out.println("sayıdan küçük en yakın sayı : " + min);
        System.out.println("sayıdan büyük en yakın sayı : " + max);
    }
}
