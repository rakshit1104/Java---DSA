import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        evenorodd(num);
    }
    static void evenorodd(int a){

        if (a%2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
