abstract class Test33 {
  public String fname = "Rajitha";
  public int age = 24;
  public abstract void study(); 
}


class Student extends Test33 {
  public int graduationYear = 2021;
  public void study() { 
    System.out.println("Studying all day long");
  }
}

class MyClass {
  public static void main(String[] args) {
     Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); 
  }
}
 
 