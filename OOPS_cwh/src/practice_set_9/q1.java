package practice_set_9;

import java.util.Scanner;

class Cylinder{

    float radius;
    float height;

    public void setRadius(float input_radius){
        this.radius = input_radius;
    }

    public void setHeight(float input_height){
        this.height = input_height;
    }

    public float getRadius(){
        return radius;
    }

    public float getHeight(){
        return height;
    }

}

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();

        System.out.print("Enter the height = ");
        float input_height = sc.nextFloat();

        System.out.print("Enter the radius = ");
        float input_radius = sc.nextFloat();

        cylinder.setRadius(input_radius);
        cylinder.setHeight(input_height);

        System.out.println("Radius = " + cylinder.getHeight());
        System.out.println("Height = " + cylinder.getRadius());

    }
}
