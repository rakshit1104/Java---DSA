public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int target = 8;
        int answer = BinarySearch(array, target);
        System.out.println(answer);
    }
    static int BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while(start<=end)
        {
            int middle = start + (end - start) / 2;

            if (target < array[middle]){
                end = middle - 1;
            } else if(target > array[middle]){
                start = middle +1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
