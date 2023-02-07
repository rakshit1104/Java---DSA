import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary:- ");
        int salary = sc.nextInt();

        if (salary<5000){
            salary = salary + 500;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
