public class Main {

    static boolean isPolindrom(int number){

        int temp = number, newNumber = 0, lastNumber;
        while (temp!=0){
            lastNumber = temp%10;

            newNumber = (newNumber*10) + lastNumber;

            temp /=10;
        }

        return newNumber == number;
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(101));
    }
}
