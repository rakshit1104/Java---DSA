package Inheritance_in_interfaces;

interface child1{
    void method1();
    void method2();
}

interface child2 extends child1{
    void method3();
    void method4();
    void method5();
}

class Parent implements child2{

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method5() {
        System.out.println("Method 5");
    }
}

public class inheritance_in_interfaces {
    public static void main(String[] args) {

        Parent obj = new Parent();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
    }
}
