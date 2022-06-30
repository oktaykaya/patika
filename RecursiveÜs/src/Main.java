public class Main {
    static int result = 1 ;
    static int usAlma(int base, int pow){

        if (pow == 0){
            return 1;
        }
        else if (base == 0){
            return 0;
        }
        result = result* base;
        usAlma(base,pow-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(usAlma(3,3));
    }
}
