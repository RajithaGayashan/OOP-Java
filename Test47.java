public class Test47 extends Thread {
  public static void main(String[] args) {
    Test47 thread = new Test47();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}