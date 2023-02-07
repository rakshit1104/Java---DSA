public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {-11, -8, -5, -3, 0, 3, 5, 8, 11, 15, 20, 25, 29, 33, 35, 38, 40};
        int target = 11;
        int answer = orderAgnostic(array, target);
        System.out.println(answer);
    }

    static int orderAgnostic(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        boolean isAsc = array[start] < array[end];

        while(start<=end){

            int middle = start + (end - start) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target < array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
