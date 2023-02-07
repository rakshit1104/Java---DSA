package practice_set_8;

class square{

    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

public class q3 {
    public static void main(String[] args) {

        square sq = new square();

        sq.side = 5;

        System.out.println("Area = " + sq.area());
        System.out.println("Perimeter = " + sq.perimeter());

    }
}
