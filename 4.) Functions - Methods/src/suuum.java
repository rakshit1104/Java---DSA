import java.util.Scanner;

public class suuum {

    static int largest(int a , int b, int c){
        if (a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        } else {
            return c;
        }
    }

    static int smallest(int a, int b, int c){
        if (a<b && a<c){
            return a;
        } else if (b>a && b>c) {
            return b;
        }else {
            return c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number = ");
        int num3 = sc.nextInt();

        System.out.println("Largest number = " + largest(num1, num2, num3));
        System.out.println("Smallest number = " + smallest(num1, num2, num3));
    }
}
