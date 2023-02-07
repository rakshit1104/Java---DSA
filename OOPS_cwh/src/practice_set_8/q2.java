package practice_set_8;

class cellphone{

    String name;

    public void ringing(){
        System.out.println(name + " ringing");
    }

    public void vibrating(){
        System.out.println(name + " vibrating");
    }

}

public class q2 {
    public static void main(String[] args) {

        cellphone cell1 = new cellphone();

        cell1.name = "OnePlus";
        cell1.ringing();
        cell1.vibrating();
    }
}
