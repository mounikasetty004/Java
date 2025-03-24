public class Oops {
    float f;
    void Add(){
        System.out.println("from method"+f);
        System.out.println("hi hello");
    }
    public static void main(String[] args) {
        Oops m1=new Oops();
        Sample s1=new Sample();
        System.out.println(m1 instanceof Oops);
        System.out.println(s1 instanceof Sample);
        m1.f=12.67f;
        m1.Add();
        System.out.println("Value of f "+m1.f);
    }
}
class Sample{

}
