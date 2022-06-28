import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("lütfen kaç satırlı üçgen istediğinizi giriniz : ");
        int basamak = scanner.nextInt();
        int tersbasamak = basamak-1;

        for (int i = 1; i<=basamak; i++){

            for (int m = 1; m<=basamak-i; m++){
                System.out.print(" ");
            }

            for (int k =1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i<=tersbasamak; i++){

            for (int m = 1; m<=i; m++){
                System.out.print(" ");
            }
            for (int k = 1; k<= (2*basamak)-(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
