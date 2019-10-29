class Test3{
    public static void main(String args[]){
        int a=9;
        int b=10;
        Test3 t=new Test3();
        System.out.println(t.sum(a,b));
        System.out.println(t.sub(a,b));
    }
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}