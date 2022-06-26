import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mesafe, age, yolculukTipi;

        double ucret = 0.1;

        System.out.print("lütfen yolculuğunuzun mesafesini giriniz : ");
        mesafe = scanner.nextInt();

        System.out.print("lütfen yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.println("lütfen yolculuk tipinizi belirtiniz(tek yön ise 1, gidiş dönüş ise 2'ye basınız)");
        yolculukTipi = scanner.nextInt();



        if (yolculukTipi == 1){
            double tutar = mesafe*ucret;
            if (age >0) {
                if (age < 12) {
                    tutar -= tutar * 0.5;
                } else if (age >= 12 && age <= 24) {
                    tutar -= tutar * 0.1;
                } else if (age > 65) {
                    tutar -= tutar * 0.3;
                }
            }
            else {
                System.out.println("yaşınız " + age + " olamaz...");
            }
            if (tutar <0){
                System.out.println("hatalı veri girdiniz..");
            }
            else{
                System.out.println("toplam tutar : " + tutar);
            }

        }
        else if (yolculukTipi == 2){
            double tutar = mesafe*ucret*2;
            if (age >0) {
                if (age < 12) {
                    tutar -= tutar * 0.5;
                } else if (age >= 12 && age <= 24) {
                    tutar -= tutar * 0.1;
                } else if (age > 65) {
                    tutar -= tutar * 0.3;
                }
            }
            else {
                System.out.println("yaşınız " + age + " olamaz...");
            }
            tutar -= tutar*0.2;
            if (tutar <0){
                System.out.println("hatalı veri girdiniz..");
            }
            else{
                System.out.println("toplam tutar : " + tutar);
            }
        }
        else {
            System.out.println("yanlış bir yolcu tipi seçtiniz...");
        }

    }
}
