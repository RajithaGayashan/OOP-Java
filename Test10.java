
class Test10{
    public static void main(String args[]){
        I_phone i=new I_phone();
        i.print();
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
class I_phone extends New_phone{
    int fingerprint=12;
    void print(){
        System.out.println(brand);
        sms();
        System.out.println(wifi);
        music();
        System.out.println(fingerprint);
         
    }}