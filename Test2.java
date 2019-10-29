//ststic method and non_static method
class Test2{
    public static void main(String args[]){
        Test2 t=new Test2();
        t.abc1();
        abc2();
        t.abc2();
    }
    public void abc1(){
        System.out.println("Method 1");
    }
    public static void abc2(){
        System.out.println("Method 2");
    }
}