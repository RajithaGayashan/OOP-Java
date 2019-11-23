
class Test8{
    public static void main(String args[]){
        A a=new A();
        A b=new A(10);
    }
}
class A{
    A(){
        System.out.println("This is default constractor");
    }
    A(int a){
        System.out.println("This is parameterized constractor "+a);
    }
}