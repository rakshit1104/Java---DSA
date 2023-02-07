package practice_set_9;

class Cylindeer{

    float radius;
    float height;

    public Cylindeer(float radiuss, float heightt) {

        this.radius = radiuss;
        this.height = heightt;

    }
}

public class q3 {
    public static void main(String[] args) {

        Cylindeer cyl2 = new Cylindeer(12,15);
        System.out.println(cyl2.radius);
        System.out.println(cyl2.height);

    }
}
