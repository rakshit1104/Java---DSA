package access_control;

public class A {
  private int num;
  String name;
  int[] array;

  public int getNum(){
      return num;
  }
  public A(int num, String name) {
      this.num = num;
      this.name = name;
      this.array =  new int[5];
  }
}
