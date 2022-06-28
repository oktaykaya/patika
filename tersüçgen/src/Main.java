import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int basamak;
        System.out.print("üçgen kaç basamaklı olacak : ");
        basamak = scanner.nextInt();

        for (int i = 1; i<=basamak; i++){

            for (int m = 1; m<=i-1; m++){
                System.out.print(" ");
            }

            for (int k = 1; k<=(2*basamak)-(2*i+1); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
