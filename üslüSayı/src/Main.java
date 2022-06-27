import java.util.Scanner;

public class Main {
    //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen üssü alınması istediğiniz sayıyı giriniz : ");
        int number = scanner.nextInt();
        System.out.print("lütfen kaç üssü almınmasını sitediğinizi yazınız : ");
        int us= scanner.nextInt();
        int total = 1;

        for (int i = 1; i<=us; i++){
            total *= number;
        }
        System.out.println("cevap = " + total);
    }
}
