import java.util.Scanner;

public class q1_largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number:- ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number:- ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }else if (num2>num1 && num2>num3){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
    }
}
