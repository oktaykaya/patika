import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen n1 değerini giriniz : ");
        int n1 = scanner.nextInt();

        System.out.print("lütfen n2 değerinizi giriniz : ");
        int n2 = scanner.nextInt();
        int ebob = 1;
    //ebob

        if (n1 >= n2) {
            int k = n2;

            while (ebob == 1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                }
                k--;
            }
            System.out.println(ebob);
        } else if (n2 >= n1) {
            int k = n1;
            while (ebob == 1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                }
                k--;
            }
            System.out.println("ebob : "+ebob);
        }



    //ekok

        int ekok = 1;
        int i =1;
        while (ekok==1){
             if (i%n1 == 0 && i%n2 == 0){
                 ekok = i;
             }
             i++;
        }
        System.out.println("ekok : " +ekok);
    }
}
