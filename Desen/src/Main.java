import java.util.Scanner;

public class Main {
    static int tempNumber = 0;
    static int counter = 0;

    static int plus(int number) {
        if (number <= 0) {
            for (int i = 1; i <= counter; i++) {
                tempNumber += 5;
            }
        }
        if (number >= tempNumber){
            return number;
        }

        number +=5;
        if (number < tempNumber){
            System.out.print(number + " ");
        }
        return plus(number);
    }

    static int minus(int number) {

        if (number <= 0) {
            System.out.print(number + " ");
            return plus(number);
        }
        System.out.print(number+ " ");
        number -= 5;
        counter++;
        return minus(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz :");
        int number = scanner.nextInt();
        System.out.println(minus(number));
    }
}
