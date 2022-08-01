import java.util.Arrays;
public class Main {
    public static boolean isHere(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        int[] checked = new int[list.length];
        int index = 0;
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < list.length; i++) {
            int counter = 0;
            if (!isHere(checked, list[i])) {
                checked[index++] = list[i];
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        counter++;
                    }
                }
                System.out.println(list[i] + " sayısı " + counter + " tekrar edildi.");
            }
        }
    }
}
