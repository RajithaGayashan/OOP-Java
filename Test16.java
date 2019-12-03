
class Test16{
    public static void main(String args[]){
        Vihicle c=new Van();//upcasting and polymorphism
        c.m();
    }
}
class Vihicle{
    void m(){
        System.out.println("Vehicle");
    }
}
class Car extends Vihicle{
    void m(){
        System.out.println("car");
    }
}
class Van extends Vihicle{
    void m(){
        System.out.println("Van");
    }
}
class Bus extends Vihicle{
    void m(){
        System.out.println("Bus");
    }
}