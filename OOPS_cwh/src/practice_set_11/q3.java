package practice_set_11;

class Monkey{
    void jump() {

    }
    void bite() {

    }
}

interface BasicAnimal{

    void eat();
    void sleep();

}

class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}

public class q3 {
    public static void main(String[] args) {

        //q5 - demonstrating polymorphism
        Monkey obj = new Human();
        obj.jump();
        obj.bite();
    }
}
