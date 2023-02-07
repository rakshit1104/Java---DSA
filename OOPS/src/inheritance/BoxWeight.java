package inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = 0;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        this.weight =  weight;
    }

    public BoxWeight(double l, double h, double weight) {
        super(l,h);
        this.weight = weight;
    }
}
