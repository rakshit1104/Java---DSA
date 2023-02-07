import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd Number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operation you want to perform = ");
        String operation = sc.next();

        switch (operation){
            case "add" :
                int sum = num1 + num2;
                System.out.println("Sum = " + sum);
                break;

            case "subtract" :
                int sub = num1 - num2;
                System.out.println("Difference = " + sub);
                break;

            case "multiply" :
                int product = num1 * num2;
                System.out.println("Product = " + product);
                break;

            case "divide" :
                int quotient = num1 / num2;
                System.out.println("Quotient" + quotient);
                break;
        }
    }
}
