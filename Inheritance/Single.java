package Inheritance;
class Parent{
    Parent(){
        System.err.println("parent constructors");
    }
    static{
        System.err.println("static block");
    }
    int n=10;
    void display(){
        System.out.println("Displaying from parent");
    }
}
public class Single extends Parent {
    void method(){
        System.out.println("child method");
    }
    static{
        System.out.println("childs static");
    }
    public static void main(String[] args) {
        Single s1=new Single();
        s1.method();
        s1.display();
        System.out.print(s1.n);
    }
}
