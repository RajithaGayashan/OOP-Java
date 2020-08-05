public class Test48 implements Runnable {
  public static void main(String[] args) {
    Test48 obj = new Test48();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
