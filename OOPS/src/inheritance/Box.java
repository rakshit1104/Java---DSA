package inheritance;

public class Box {

    double l;
    double w;
    double h;

    Box(){
        this.l = 0;
        this.w = 0;
        this.h = 0;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this. w = w;
        this.h = h;
    }

    Box(double l, double w){
        this.l = l;
        this.w = w;
    }
}
