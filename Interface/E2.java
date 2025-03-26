package Interface;

interface E1{
    int min=5;
    void add();
}
interface E2{
    void display();
}
// class E1 implements E2{
//     public void add(){
//         System.err.println("hii");
//     }
//     public static void main(String[] args) {
//         E1 a=new E1();
//         a.add();System.out.println(a.min);
//     }
// }
class E implements E1,E2{
    public void add(){
        System.err.println("hii");
    }
    public void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        E a=new E();
        a.display();
        a.add();
        System.out.println(a.min);
    }
}