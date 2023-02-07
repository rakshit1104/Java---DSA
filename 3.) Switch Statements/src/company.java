import java.util.Scanner;

public class company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EmpID:- ");
        int EmpID = sc.nextInt();
        System.out.print("Enter Department:- ");
        String Department = sc.next();
        System.out.println("");

        switch (EmpID){
            case 101 :
                System.out.println("Employee ID = 101");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Marketing" -> System.out.println("Marketing Department");
                    case "Operations" -> System.out.println("Operations Department");
                }
                break;
            case 102 :
                System.out.println("Employee ID = 102");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Marketing" -> System.out.println("Marketing Department");
                    case "Operations" -> System.out.println("Operations Department");
                }
                break;
            case 103 :
                System.out.println("Employee ID = 103");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Marketing" -> System.out.println("Marketing Department");
                    case "Operations" -> System.out.println("Operations Department");
                }
                break;
            case 201 :
                System.out.println("Employee ID = 201");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Marketing" -> System.out.println("Marketing Department");
                    case "Operations" -> System.out.println("Operations Department");
                }
                break;
            case 202 :
                System.out.println("Employee ID = 202");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Marketing" -> System.out.println("Marketing Department");
                    case "Operations" -> System.out.println("Operations Department");
                }
                break;

        }
    }
}
