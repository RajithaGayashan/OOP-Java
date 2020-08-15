class Person {    
   public void teach(){
      System.out.println("Person can teach");
   }
}
class Teacher extends Person {
   public void teach() {
      System.out.println("Teacher can teach in a school");
   }
}
public class Test57 {
   public static void main(String args[]) {
      Person person = new Person(); 
      Person another_person = new Teacher(); 
      Teacher teacher = new Teacher(); 
      person.teach();
      another_person.teach();
      teacher.teach();
   }
}