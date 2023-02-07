import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:- ");
        int num2 = sc.nextInt();

        int answer = addition(num1 , num2);
        System.out.print("Sum = " + answer);

    }
    static int addition(int a , int b){
        int sum = a + b;
        return sum;
    }
}
