import java.util.Scanner;
class Test36{
    void add(double x,double y){
        System.out.println("Add : "+(x+y));
    }
    void sub(double x,double y){
         System.out.println("sub : "+(x-y));
        ;
    }
    void mul(double x,double y){
        System.out.println("mul : "+(x*y));
    }
    void div(double x,double y){
        System.out.println("div : "+(x/y));
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Test36 t=new Test36();
        
        System.out.print("Enter the first number : ");
        double x=s.nextDouble();
        
        System.out.print("Enter the second number : ");
        double y=s.nextDouble();
        
        t.add(x,y);
        t.sub(x,y);
        t.mul(x,y);
        t.div(x,y);
        
    }
}