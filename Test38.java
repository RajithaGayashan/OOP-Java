interface FirstInterface {
  public void myMethod(); 
}

interface SecondInterface {
  public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("My Method");
  }
  public void myOtherMethod() {
    System.out.println("My Other Method");
  }
}
class Test38 {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
