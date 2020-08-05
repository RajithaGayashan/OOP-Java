import java.util.HashMap;

public class Test44 {
  public static void main(String[] args) {
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    people.put("Matara", 32);
    people.put("Galle", 30);
    people.put("Colombo", 33);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }
}
