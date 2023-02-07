package Inheritance.Method_Overloading;

class Rakshit{

    public int a(){
        return 11;
    }

    public void name(){
        System.out.println("Rakshit Pandey in class Rakshit");
    }

}

class Pandey extends Rakshit{

    public int b(){

        return 2002;
    }

    @Override
    public void name(){

        System.out.println("Rakshit Pandey in class Pandey");
    }

}

public class Main {
    public static void main(String[] args) {

        Pandey abc = new Pandey();
        abc.name();

        Rakshit xyz = new Rakshit();
        xyz.name();
    }
}
