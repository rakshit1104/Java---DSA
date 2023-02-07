import java.util.Scanner;

public class EvenNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int a = input;
        boolean answer = count(a);
        System.out.println(answer);
    }
    static boolean count(int a){
        String str1 = Integer.toString(a);
        int countnum = str1.length();
        if (countnum % 2 == 0 ){
            return true;
        }
        return false;
    }
}
