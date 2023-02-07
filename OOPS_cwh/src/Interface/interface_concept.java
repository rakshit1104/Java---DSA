package Interface;

interface mobile{

    void ringtone();
    void wallpaper();
    void power();
    void volume();
}

interface cycle{

    void pedal();
    void brake();
    void gear();
    void colour();
}

class Realme implements mobile, cycle{

    @Override
    public void ringtone() {
        System.out.println("Ringing");
    }

    @Override
    public void wallpaper() {
        System.out.println("Bright Wallpaper");

    }

    @Override
    public void power() {
        System.out.println("Power OFF");

    }

    @Override
    public void volume() {
        System.out.println("Volume");

    }

    @Override
    public void pedal() {
        System.out.println("Pedalling");

    }

    @Override
    public void brake() {
        System.out.println("Speeding Down");

    }

    @Override
    public void gear() {
        System.out.println("Gear Up");

    }

    @Override
    public void colour() {
        System.out.println("Black Colour");

    }
}

public class interface_concept {
    public static void main(String[] args) {

        Realme my = new Realme();
        my.brake();
        my.colour();
        my.gear();
        my.pedal();
        my.power();
        my.wallpaper();
        my.volume();
        my.ringtone();
    }
}
