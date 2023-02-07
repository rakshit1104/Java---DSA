import java.util.Scanner;
public class fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of the Fruit");
            case "Pineapple":
                System.out.println("My favorite fruit");
            case "Litchi":
                System.out.println("Available only in rainy seasons");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }

        switch (fruit){
            case "Mango" -> System.out.println("King of the fruits");
            case "Pineapple" -> System.out.println("My favorite fruit");
        }
    }
}
