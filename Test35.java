class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 50;
  }
}

public class Test35 {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}