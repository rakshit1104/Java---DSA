import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to find in the array = ");
        int input = sc.nextInt();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = input;
        int start = 1;
        int end = 4;

        int answer = LinearSearch(array, target, start, end);
        System.out.println("The index of the target element is = " + answer);

    }

    static int LinearSearch(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
