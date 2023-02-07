package practice_set_11;

abstract class TelePhone{

    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends TelePhone{
    @Override
    void ring() {

    }

    @Override
    void lift() {

    }

    @Override
    void disconnect() {

    }

    void disco(){

    }
}

public class q4 {
    public static void main(String[] args) {

        TelePhone obj = new SmartTelephone();
        obj.disconnect();
    }
}
