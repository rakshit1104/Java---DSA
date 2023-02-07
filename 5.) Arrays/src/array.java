import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of " + i + " index = ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Output");

        //output
        for (int i = 0; i < size; i++) {
            System.out.print("The value of " + i + " index = ");
            System.out.println(numbers[i]);
        }

        //2nd way of output
        System.out.println(Arrays.toString(numbers));
    }
}
