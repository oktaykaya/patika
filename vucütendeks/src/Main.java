import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // boy kilo endeksini hesaplama
        System.out.println("Welcome to the mine project");
        System.out.println("please enter the your size (1,78) : ");
        double size = scanner.nextDouble();
        System.out.println("please enter the your weight");
        double weight = scanner.nextDouble();

        double endex = weight / ( size * size);

        System.out.println("your endex is : " + endex);
    }
}
