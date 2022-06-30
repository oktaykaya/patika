import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0, i = 1;
        while (i-1 != counter) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        while (i-1 !=counter) {

            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        int sayı1;
        int sayı2;
        int result = 0;
        System.out.print("1. sayı :");
        sayı1 = scan.nextInt();
        System.out.print("2. sayı :");
        sayı2 = scan.nextInt();

        result = sayı1%sayı2;
        System.out.println(sayı1+" % "+ sayı2 + " = " + result);
    }
    static void alanvecevre(){
        int select, kenar1, kenar2, alan, cevre;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. alan\n" +
                "2. çevre");
        select = scan.nextInt();
        if (select == 1){
            System.out.println("1. kenar : ");
            kenar1 = scan.nextInt();
            System.out.println("2. kenar : ");
            kenar2 = scan.nextInt();
            alan = kenar1*kenar2;
            System.out.println("dikdörtgenin alanı : " + alan);
        }
        else {
            System.out.println("1. kenar : ");
            kenar1 = scan.nextInt();
            System.out.println("2. kenar : ");
            kenar2 = scan.nextInt();
            cevre = 2*kenar1 + 2*kenar2;
            System.out.println("dikdörtgenin çevresi : " + cevre);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanvecevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
