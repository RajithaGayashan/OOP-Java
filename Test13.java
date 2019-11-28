//Method overriding
class Monkey{
    void eat(){
        System.out.println("Monkey can eat");
    } 
}
class Man extends Monkey{
    void eat(){
        System.out.println("Man can eat");
    }
}
class Test13{
    public static void main(String args[]){
        Man ob1=new Man();
        ob1.eat();
        //Man ob2=new Monkey();-error
        //ob2.eat();
        Monkey ob3=new Monkey();
        ob3.eat();
        Monkey ob4=new Man();
        ob4.eat();
    }
}