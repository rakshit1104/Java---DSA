package Interface;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I will put brake to the car");
    }

    @Override
    public void start() {
        System.out.println("I will start the car");
    }

    @Override
    public void stop() {
        System.out.println("I will stop the car");
    }

    @Override
    public void play() {
        System.out.println("I will play music in the car");
    }

    @Override
    public void pause() {
        System.out.println("I will pause the music in the car");
    }
}
