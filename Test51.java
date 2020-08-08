

public class Test51 {
 public static int febonacciRecursion(int n){
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        return febonacciRecursion(n-2)+febonacciRecursion(n-1);
    }

    public static void main(String [] args){
         int maxNumber=10;
         System.out.print("Febonacci series of "+maxNumber+" numbers : ");
         for(int i=0;i<=maxNumber;i++){
             System.out.println(febonacciRecursion(i)+" ");
         }
    } 
}
