import java.util.Scanner;
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//Örnek : 1643 = 1 + 6 + 4 + 3 = 14
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz : ");
        int number = scanner.nextInt();
        int value;
        int tempnumber = number;
        int result = 0;
        while(tempnumber != 0){
            value = tempnumber % 10;
            tempnumber /= 10;
            result += value;
        }
        System.out.println(result);
    }
}
