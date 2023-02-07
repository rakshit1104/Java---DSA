import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Rakshit!");

        String name = "Rakshit";
        String owner = name;
        int age = 19;
        System.out.println("Name = " + name);
        System.out.println("Owner = " + owner);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name2 = sc.next();
        System.out.println("Input Name = " + name2);

        System.out.print("Enter number 1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        switch (num1){
            case 11:
                System.out.println("Birthday Date");
                break;
            case 111:
                System.out.println("Ye to  111 hai");
                break;
            default:
                System.out.println("Invalid");
        }
        HelloJava();
        Addition(4,5);
        System.out.println(Substraction(5,3));
        int c = Substraction(10, 7) - 2;
        System.out.println(c);
    }
    public static void HelloJava(){
        System.out.println("Hello Java");
    }

    public static void Addition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static int Substraction(int a, int b){
        int difference = a - b;
        return difference;
    }
}
