import java.util.Scanner;
 class Girl{
    private String girlName;

    public void setName(String name){
        String girlName=name; 
    }
    public String getName(){
        return girlName;
        
    }
    public void output(){
        
        System.out.println("Your GF name is  "+getName());
    }
}
class Test47{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Girl g=new Girl();
        System.out.print("Enter your Girl name :");
        String name=s.next();
        g.setName(name);
        g.output();
    }
}