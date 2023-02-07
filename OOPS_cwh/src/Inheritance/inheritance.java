package Inheritance;

class parent{

    parent(){
        System.out.println("This is main constructor of parent class");
    }

    parent(int a){
        System.out.println("This is the overloaded constructor of parent class which contains the value of a = " + a);
    }
}

class child extends parent{

    child(){

        System.out.println("This is main constructor of child class");
    }

    child(int a, int b){
        super(a);
        System.out.println("This is the overloaded constructor of child class which contains the value of b = " + b);
    }
}

class derivedChild extends child{

    derivedChild(){

        System.out.println("This is main constructor of derivedChild class");
    }

    derivedChild(int a, int b, int c){
        super(a, b);
        System.out.println("This is the overloaded constructor of derivedChild class which contains the value of c = " + c);
    }
}

public class inheritance {
    public static void main(String[] args) {

        derivedChild obj = new derivedChild(11,12,13);
    }
}
