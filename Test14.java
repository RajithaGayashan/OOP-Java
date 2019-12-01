
class Test14{
    public static void main(String args[]){
        Man m=new Man();
        m.eat();
    }
}
class Monkey {
    Monkey(){
        int leg=2;
        System.out.println("Monkey constractor");
        System.out.println(leg);
    }
    void eat(){
        System.out.println("Monkey eat");
    }
}
class Man extends Monkey{
    Man(){
        super();
    }
    void eat(){
        System.out.println("Man eat");
        super.eat();

    }
}
