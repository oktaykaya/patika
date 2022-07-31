
public class Main {
        public static void main(String[] args) {

            int[] list = {1,2,3,4,5,6,7,8,9};
            double sayi = 1;
            double sum = 0;
            for(double i : list){
                sum = sum + sayi/i;
            }
            System.out.println(list.length/sum);
        }
    }

