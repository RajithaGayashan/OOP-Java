
class Test4{
    public static void main(String args[]){
        Test4 t=new Test4();
        t.sum();
        t.sum(10);
        t.sum(10,20);
    }
    public void sum(){
        System.out.println("Method 1");
    }
    public void sum(int a){
        System.out.println("Method 2");
    }
    public void sum(int a,int b){
        System.out.println("Sum="+(a+b));
    }
}
