import java.util.HashSet;

public class Test45 {
  public static void main(String[] args) {

    // Create a HashSet object called numbers
    HashSet<Integer> town = new HashSet<Integer>();

    // Add values to the set
    town.add(14);
    town.add(1);
    town.add(2);

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1;i <= 15; i++) {
      if(town.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }
}