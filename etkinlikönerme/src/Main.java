import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;

        System.out.println("lütfen hava sıcaklığını giriniz : ");
        heat = scanner.nextInt();

        if (heat<5){
            System.out.println("hava bugün kayak yapmak için mükemmel");
        }
        else if (heat>=5 && heat<=14){
            System.out.println("sinemaya gidebilirsiniz");
        }
        else if (heat==15){
            System.out.println("sinemaya veya bir pikniğe gidebilirsiniz");
        }
        else if ((heat>=16 && heat<=25)){
            System.out.println("bir mangal iyi giderdi");
        }
        else{
            System.out.println("Havuza ya da denize gidebilirsin dikkat et yanma");
        }

    }
}
