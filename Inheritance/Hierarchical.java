package Inheritance;
class Base{
    void Bmethod(){
        System.out.println("base method");
    }
}
public class Hierarchical extends Base {
    public static void main(String[] args) {

    Hierarchical h1=new Hierarchical();
    h1.Bmethod();
    }
}
class Hierarchical1 extends Base {
    public static void main(String[] args) {

    Hierarchical1 h1=new Hierarchical1();
    h1.Bmethod();
    }
}
class Hierarchical2 extends Base {
    public static void main(String[] args) {

    Hierarchical2 h1=new Hierarchical2();
    h1.Bmethod();
    }
}
