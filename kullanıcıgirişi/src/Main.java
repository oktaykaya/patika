import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName,password;

        System.out.print("lütfen kullanıcı adınızı giriniz : ");
        userName = scanner.nextLine();

        System.out.print("lütfen şifrenizi giriniz :");
        password = scanner.nextLine();

        if (userName.equals("java") && password.equals("java123")){
            System.out.println("Başarıyla Giriş Yaptınız !");
        }
        else {
            System.out.println("Bilgilerinizi yanlış girdiniz...");
        }
    }
}
