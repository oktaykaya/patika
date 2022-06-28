import java.util.Scanner;

public class Main {
    //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.
    // ” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
    //Mükemmel Sayı Nedir ?
    //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("lütfen mükemmel sayı olup olmadığını kontrol etmek için bir sayı giriniz :");
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i<=number; i++){
            if (number%i == 0){
                counter += i;
            }
        }
        if (counter/2 == number){
            System.out.println(number + " bir mükemmel sayıdır");
        }
        else {
            System.out.println(number+" bir mükemmel sayı değildir");
        }
    }
}
