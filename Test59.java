
public class Test59 {
   public static void main(String args[]){
    int num=19;
    int i=2;
    boolean flog=false;
    if(num==0 || num==1) {
        System.out.println(num+" is not a Prime number ");
    }
    while(i<=num/2){
        if(num%i==0){
            flog=true;
            break;
        }
        i++;
    }
    if(!flog){
            System.out.println(num+" is a Prime number");

    }else{
            System.out.println(num+" is a not Prime number");

    }
  }
}
