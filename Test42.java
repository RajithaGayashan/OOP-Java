import java.util.ArrayList;
import java.util.Collections;  

public class Test42 {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    myNumbers.add(30);
    myNumbers.add(35);

    Collections.sort(myNumbers); 

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}