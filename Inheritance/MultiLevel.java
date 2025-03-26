package Inheritance;
class Grandpa{
    int a=90;
    void access(){
        System.out.println("Grandpa class method");
    }
}
class parent extends Grandpa{
    int k=78;
    void display(){
        System.out.println("parent class method");
    }
}
public class MultiLevel extends parent{
    void method(){
        System.out.println("child method");
    }
    public static void main(String[] args) {
        MultiLevel c1=new MultiLevel();
        c1.access();
        c1.display();
        c1.method();
        System.out.println(c1.a);
        System.out.println(c1.k);
    }
}
