public class FindMinMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1};
        System.out.println("Minimum value = " + min(array));
        System.out.println("Maximum value = " + max(array));

    }
    static int min(int[] array){
        int minvalue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minvalue){
                minvalue = array[i];
            }
        }
        return minvalue;
    }
    static int max(int[] array){
        int maxvalue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxvalue){
                maxvalue = array[i];
            }
        }
        return maxvalue;
    }
}
