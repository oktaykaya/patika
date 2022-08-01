import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Siralama(int[] arr){
        int x = 0;
        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length; j++){

                if ((arr[i] < arr[j]) && (i != j)){
                    x = arr[j];
                    arr[j] = arr[i];
                    arr[i] =x;
                }
            }
        }

        System.out.println("Küçükten büyüğe doğru sıralı hali : " +Arrays.toString(arr));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen listenizin kaç elemanlı olacağını yazınız : ");
        int n = scanner.nextInt();
        int eleman;
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz ");
        for (int i = 0 ; i < n ; i++){
            System.out.print((i+1) + ". eleman : ");
            eleman = scanner.nextInt();
            list[i] = eleman;

        }
        System.out.println("Girilen değerler sırasıyla : " + Arrays.toString(list));

        Siralama(list);
    }
}
