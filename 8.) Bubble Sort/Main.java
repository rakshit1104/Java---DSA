import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {-2, -80, -60, -11, 11, 0, 99, 111, -111, 50, 45};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void BubbleSort(int[] array){

        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
