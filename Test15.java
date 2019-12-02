
class Test15{
    public static void main(String args[]){
        Super s1=new Sub();//upcasting
        s1.m();
        Sub s2=(Sub) s1; //downcasting
        s2.m();
        s1.m();
    }
}
class Super{
    void m(){
        System.out.println("Super class");
    }
}
class Sub extends Super{
    void m(){
        System.out.println("Sub class");
    }
} 