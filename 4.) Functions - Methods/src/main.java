public class main {
    public static void main(String[] args) {
        int a = 90;
        System.out.println(a);
        {
            a = 100;
            System.out.println(a);

            int b = 20;
            System.out.println(b);
        }
        int b = 200;
        System.out.println(b);
    }
}
