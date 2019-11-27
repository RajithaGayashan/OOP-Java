public class Test11{
    public static void main(String args[]){
        B b=new B();
        b.m();
        b.n();
        
    }
}
class A{
     void m(){
        System.out.println("Line A");
    }
    void n(){
        System.out.println("Line B");
    }
}
class B extends A{
    void m(){
        System.out.println("Line C");
    }
}