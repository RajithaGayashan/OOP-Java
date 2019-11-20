
class Test5{
    static int i=10;
    int k=30;
    public static void main(String args[]){
        int j=20;
        Test5 t=new Test5();
        System.out.println("main method"+i);
        System.out.println("main method"+j);
        //System.out.println("main method"+k);
        t.m();
        t.n();
         
    }
    public static void m(){
        System.out.println("static method"+i);
        //System.out.println("static method"+k);
        //System.out.println("static method"+j);
    }
    public void n(){
        System.out.println("non static method"+k);
        System.out.println("non static method"+i);
       // System.out.println("non static method"+j);
    
    }
}