import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int add = num1 + num2;
        System.out.println(add);
    }
}
