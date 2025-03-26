package Inheritance;
class Base{
    void display(){
        System.out.println("base class");
    }
}
class derived extends Base{
    void method(){
        System.out.println("derived class from base");
    }
    public static void main(String[] args) {
        derived d=new derived();
        d.display();
        d.method();
    }
}
class derived1 extends Base{
    void method1(){
        System.out.println("derived1 class from base");
    }
    public static void main(String[] args) {
        derived1 d1=new derived1();
        d1.display();
        d1.method1();
    }
}
public class Hybrid extends derived1{
    public static void main(String[] args) {
        Hybrid k1=new Hybrid();
        k1.method1();
        k1.display();
    }
}
