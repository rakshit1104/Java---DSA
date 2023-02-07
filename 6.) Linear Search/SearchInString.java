import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String input = sc.next();
        String name = input;
        System.out.print("Enter teh character you want to check = ");
        char input2 = sc.next().charAt(0);
        char target = input2;
        boolean answer = search(name, target);
        System.out.println(answer);

    }
    static boolean search(String name, char target){
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
