import java.util.Scanner;

public class  sum_return {
    public static void main(String[] args) {
        int answer = sum();
        System.out.println(answer);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
