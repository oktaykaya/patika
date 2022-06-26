import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("lütfen bir sayı giriniz : ");
        double sayi1 = scanner.nextDouble();

        System.out.println("lütfen bir sayı daha giriniz : ");
        double sayi2= scanner.nextDouble();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Bölme\n4.Çarpma");
        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz : ");
        int islem= scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println(sayi1 + "+" +sayi2 +" =" + (sayi1+sayi2) );
                break;
            case 2:
                System.out.println(sayi1 + "-" +sayi2 +" =" + (sayi1-sayi2) );
                break;
            case 3:
               if (sayi2!=0){
                   System.out.println(sayi1 + "/" +sayi2 +" =" + (sayi1/sayi2) );
               }
               else{
                   System.out.println("bir sayı 0 a bölünemez...");
               }
               break;
            case 4:
                System.out.println(sayi1 + "*" +sayi2 +" =" + (sayi1*sayi2) );
                break;
        }

    }
}
