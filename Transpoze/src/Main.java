import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
    static int col;
    static int line;

    public static void main(String[] args) {

        //matrisimiz
        int[][] A = {{1,2,3},{4,5,6}};

        // satırlarımızı ve sütünlarımızı belirliyoruz matrisi kullanıcıdan alırsan ona göre şekillendirebiliriiz
        col = 3;
        line = 2;

        System.out.println();
        System.out.println("Matris");
        System.out.println();

        //matrisi yazdırıyoruz ve arraylist kullanarak bir sırayla kaydediyoruz
        for (int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                System.out.print(A[i][j] + " ");
                arrayList.add(A[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println("Transpoze");
        System.out.println();

        //yeni bir matris oluşturuyoruz
        int[][] B = new int[col][line];

        //yeni matrisi yazdırıyoruz
        for (int i = 0; i<line; i++) {
            for (int j = 0; j < col; j++) {

                //matrisi yazdırırken bulduğumuz algoritma kuralına uyarak arraylistteki değerlerimizi matrisin olduğu yerlere yerleştiriyoruz
                 B[j][i] = arrayList.get(0);
                 // eklediğimiz arraylist değerlerini siliyoruz böylece hep ilk arraylist değerini yazıyoruz.
                 arrayList.remove(0);
            }
        }

        //yeni matrisi bastırıyoruz
        for (int[] i : B){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }


    }
}
