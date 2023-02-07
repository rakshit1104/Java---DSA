import java.util.Scanner;

public class parameter_int {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:- ");
        int num2 = sc.nextInt();


        int answer = addition(5 , 7);
        System.out.print(answer);
    }

    static int addition(int a , int b){
        int sum = a + b;
        return sum;
    }
}
