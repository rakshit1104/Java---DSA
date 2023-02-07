import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:- ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number:- ");
        int num3 = sc.nextInt();

        int answer1 = max(num1 , num2 , num3);
        System.out.println("Maximum Number:- " + answer1);

        int answer2 = min(num1 , num2 , num3);
        System.out.print("Minimum Number:- " + answer2);
    }

    static int  max(int a , int b , int c){
        int highest = a;
        if (b>a && b>c){
            highest = b;
        }
        if (c>a && c>b){
            highest = c;
        }
        return highest;
    }

    static int  min(int a , int b , int c){
        int lowest = a;
        if (b<a && b<c){
            lowest = b;
        }
        if (c<a && c<b){
            lowest = c;
        }
        return lowest;
    }
}
