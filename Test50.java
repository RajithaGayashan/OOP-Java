public class Test50 extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Test50 thread = new Test50();
    thread.start();
    while(thread.isAlive()) {
    System.out.println("Waiting...");
  }
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}