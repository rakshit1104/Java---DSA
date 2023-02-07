import java.util.Scanner;

public class calculator {

    static int addition(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    static int subtraction(int num1, int num2){
        int difference = num1 - num2;
        return difference;
    }

    static int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    static int division(int num1, int num2){
        int quotient = num1 / num2;
        return quotient;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator you want to perform = ");
        String operator = sc.next();

        switch (operator) {

            case "+":
                System.out.println("Sum = " + addition(num1, num2));
                break;

            case "-":
                System.out.println("Difference = " + subtraction(num1, num2));
                break;

            case "*":
                System.out.println("Product = " + multiply(num1, num2));
                break;

            case "/":
                System.out.println("Quotient = " + division(num1, num2));
                break;
        }
    }
}
