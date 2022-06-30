import java.util.Scanner;

public class Main {
    static int counter = 0;
    static int i = 1;
    static boolean isAsalmi(int number){
       int temp = number;
       temp = number % i;
       if (temp == 0){
           counter++;
       }
       i++;

       if (counter >= 3){
           return false;
       }
       if (number == 1){
           return false;
       }
       else if (counter == 2 && i> number){
           return true;
       }
        return isAsalmi(number);

    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        number = scanner.nextInt();
        boolean asalmi;
        asalmi=isAsalmi(number);
        if (asalmi == false){
            System.out.println(number + " asal sayı değildir ");
        }
        else {
            System.out.println(number + " asal sayıdır");
        }

    }
}
