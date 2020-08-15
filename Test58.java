class Calculator {
    void add(int a, int b) {
         System.out.println(a+b);
    }
    void add(int a, int b, int c) {
         System.out.println(a+b+c);
    }
}
public class Test58 {
   public static void main(String args[]) {
       Calculator calculator = new Calculator();
       calculator.add(10, 20); 
       calculator.add(10, 20, 30); 
   }
}