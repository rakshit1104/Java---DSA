package inheritance;

public class Main {
    public static void main(String[] args) {

        Box boxnew = new Box(1);
        System.out.println(boxnew.l);

        Box boxnew2 = new Box(2,3);
        System.out.println(boxnew2.l);

        Box boxnew3 = new Box(4,5,6);
        System.out.println(boxnew3.l);

        BoxWeight boxweight = new BoxWeight(10,50);
        System.out.println(boxweight.weight);

        BoxWeight boxweight2 = new BoxWeight(12,13,14,100);
        System.out.println(boxweight2.weight);

        BoxCost boxcost = new BoxCost(2,3,75,5000);
        System.out.println(boxcost.cost);

    }
}
