
class Test12{
    public static void main(String args[]){
       C c=new C();
       B b=new B();
       D d=new D();
        //in class
        b.m();

        //in package
        System.out.println("Public-"+c.a); 
        System.out.println("Protected-"+c.b);
        System.out.println("Default-"+c.c);
        //System.out.println("Private-"+c.d);

        //in sub class(same package)
        d.n();


    } 
}
class A{
    public int a=10;
    protected int b=11;
    int c=12;
    private int d=13;
}
class B{
    public int a=10;
    protected int b=11;
    int c=12;
    private int d=13;
    
    void m(){
        System.out.println("Public-"+a);
        System.out.println("Protected-"+b);
        System.out.println("Default-"+c);
        System.out.println("Private-"+d);
    
    }
} 
class C{
    public int a=10;
    protected int b=11;
    int c=12;
    private int d=13;
}
class D extends A{
    void n(){
        System.out.println("Public-"+a);
        System.out.println("Protected-"+b);
        System.out.println("Default-"+c);
        //System.out.println("Private-"+d);
    }
}
