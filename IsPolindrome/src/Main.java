import java.util.Scanner;

public class Main {

    public static boolean isPolindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen kontrol etmek istediğiniz kelimeyi giriniz : ");
        String word = scanner.nextLine();

       isPolindrome(word);

       if (isPolindrome(word) == true){
           System.out.println( word + " kelimesi bir polindrome kelimedir.");
       }
       else {
           System.out.println(word + " kelimesi bir polindrome kelime değildir.");
       }
    }
}
