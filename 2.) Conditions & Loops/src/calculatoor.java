import java.util.Scanner;

public class calculatoor {
    public static void main(String[] args) {

        System.out.println("Welcome to the calculator application");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.println("1.) Addition");
        System.out.println("2.) Subtraction");
        System.out.println("3.) Multiplication");
        System.out.println("4.) Division");


        System.out.print("Enter the index number of the operation you want to perform = ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                int sum = num1 + num2;
                System.out.println("Sum = " + sum);
                break;

            case 2:
                int diff = num1 - num2;
                System.out.println("Difference = " + diff);
                break;

            case 3:
                int product = num1 * num2;
                System.out.println("Product = " + product);
                break;

            case 4:
                int quotient = num1 / num2;
                System.out.println("Quotient = " + quotient);
                break;
        }
    }
}
