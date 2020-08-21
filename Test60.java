class NumberValue {
   private int num;
   public NumberValue() {
      num = 6;
   }
   public NumberValue(int n) {
      num = n;
   }
   public void display() {
      System.out.println("The number is: " + num);
   }
}
public class Test61 {
   public static void main(String[] args) {
      NumberValue obj1 = new NumberValue();
      NumberValue obj2 = new NumberValue(15);
      obj1.display();
      obj2.display();
   }
}