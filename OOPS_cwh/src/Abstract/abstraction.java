package Abstract;

abstract class mobile{

    abstract void ringtone();
    abstract void wallpaper();
    abstract void power();
    void volume() {
        System.out.println("Volume");
    }
}

abstract class cycle{

    abstract void pedal();
    abstract void brake();
    abstract void gear();
    void colour() {
        System.out.println("Colour of cycle");
    }
}

class Redmi extends mobile{
    @Override
    void ringtone() {
        System.out.println("Ringing");
    }

    @Override
    void wallpaper() {
        System.out.println("Nice Wallpaper");
    }

    @Override
    void power() {
        System.out.println("Power OFF");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Redmi my = new Redmi();
        my.power();
        my.ringtone();
        my.wallpaper();
        my.volume();

    }
}
