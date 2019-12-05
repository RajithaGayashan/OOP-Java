
class A{
    private int id;
    private String name;
    
    public void setId(int id){
        this.id=id;
    }
    public int getID(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Test19{
    public static void main(String args[]){
        A a=new A();
        a.id=1;
        a.name="Rajitha";

    }
}
