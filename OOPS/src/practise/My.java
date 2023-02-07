package practise;

public class My {

    public My() {
        System.out.println("Hello");
    }

    static void Name(String name) {
        System.out.println("Hello " + name);
    }

    public My(String name){
        System.out.println("Helloooo " + name);
    }

    public static void main(String[] args) {
        Name("Rakshit");

        My obj = new My("Rakshit Pandey");
    }
}
