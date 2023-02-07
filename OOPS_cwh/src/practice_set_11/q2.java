package practice_set_11;

class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Writing");
    }

    @Override
    void refill() {
        System.out.println("Refilling");
    }

    void changeNib(){
        System.out.println("Changing Nib");
    }
}

public class q2 {
}
