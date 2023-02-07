import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to find in the array = ");
        int input = sc.nextInt();
        int target = input;

        int answer = LinearSearch(array, target);
        System.out.println("The index of the target element is = " + answer);

    }

    static int LinearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
