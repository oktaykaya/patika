public class Main {
    public static void main(String[] args) {

        for (int i = 2; i<=100; i++){
            int counter = 0;
            for (int m = 2; m<=i; m++){

                if (i%m == 0){
                    counter++;
                }
            }
            if(counter == 1) {
                System.out.print(i +",");
            }
        }
    }
}
