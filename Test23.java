import java.util.Scanner;
class Test37{
    void add(int start,int end){
        int total=0;
        for(int x=start;x<=end;x++){
            total+=x;
        }
        System.out.println(total);
    }
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Test37 t=new Test37();
        
        System.out.print("Start Number : ");
        int start=s.nextInt();
        
        System.out.print("End Number : ");
        int end=s.nextInt();
        t.add(start,end);
    }
}