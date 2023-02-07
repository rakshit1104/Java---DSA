package inheritance;

public class BoxCost extends BoxWeight{
    double cost;

    BoxCost(){
        this.cost = 0;
    }

    BoxCost(double l, double h, double weight, double cost){
        super(l,h,weight);
        this.cost = cost;
    }

}
