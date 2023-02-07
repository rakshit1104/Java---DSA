import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:- ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation:- ");
        String operation = sc.next();

        switch (operation){
            case "add" :
                int sum = num1 + num2;
                System.out.print("Sum = " + sum);
                break;
            case "subtract":
                int difference = num1 - num2;
                System.out.print("Difference = " + difference);
                break;
            case"multiply":
                int product = num1 * num2;
                System.out.print("Product = " + product);
                break;
            case "divide":
                int division = num1 / num2;
                System.out.print("Quotient = " + division);
                break;
            default:
                System.out.print("Enter correct operation");
        }
    }
}
