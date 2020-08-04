class OuterClass {
  int x = 100;

  class InnerClass {
    int y = 20;
  }
}
 class Test34 {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y * myOuter.x);
  }
 }
