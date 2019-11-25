
class Test9{
    public static void main(String args[]){
        New_phone n=new New_phone();
        System.out.println(n.brand);
        n.sms();
        System.out.println(n.wifi);
        n.music();
    }
}
class Old_phone{
    String brand="Nokia";
    void sms(){
        System.out.println("sms");
    }
}
class New_phone extends Old_phone{
    int wifi=10;
    void music(){
        System.out.println("music");
    }
}