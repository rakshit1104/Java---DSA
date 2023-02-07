import java.util.Scanner;

public class NumberOfEvenDigit {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 121};
        System.out.println("Number of elements with even count = " + count(array));
    }

    static int count(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            String str1 = Integer.toString(a[i]);
            int countnum = str1.length();
            if (countnum % 2 == 0)
            {
                count ++;
            }
        }
        return count;
    }
}
