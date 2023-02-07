package practice_set_5;

import java.util.Scanner;

public class practice_set_5 {
    public static void main(String[] args) {

//Practice - 5 question number - 9

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of which you want the Multiplication Table = ");
//        int num = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i<= 10; i++){
//            System.out.println(num + "*" + i + "=" + num*i);
//            sum = sum + (num*i);
//        }
//        System.out.println("Sum = " + sum);

//Practice - 5 question number - 1

//        System.out.print("Enter the number of lines of star you want to print = ");
//        int n = sc.nextInt();
//        for (int i = 0; i< n; i++){
//            for (int j = 0; j < i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//Reverse a String

        System.out.print("Enter a String = ");
        String str = sc.nextLine();

        String strnew = "";
        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            strnew = ch + strnew;
        }
        System.out.println("Reversed String = " + strnew);
    }
}
