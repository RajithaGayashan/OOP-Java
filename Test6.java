
class Test6{
    public static void main(String args[]){
        m(10,20);
        m(10l,30L);
    }
    public static void m(int x,int y){
        System.out.println("int method "+(x+y));
    }
    public static void m(double x,double y){
        System.out.println("Double method "+(x+y));
    }
} 