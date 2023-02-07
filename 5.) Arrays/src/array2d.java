import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns = ");
        int column = sc.nextInt();

        int [] [] array = new int[row][column];

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array [i] [j] = sc.nextInt();
            }
        }
        
        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i] [j] + " ");
            }
            System.out.println("");
        }
    }
}
