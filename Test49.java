public class Test49 extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Test49 thread = new Test49 ();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}