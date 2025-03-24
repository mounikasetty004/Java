public class Rectangle{
    static int x=10;
    int length,width,side;
    void getdata(int a,int b){
        length=a;
        width=b;
        side=a;
    }
    int rectarea(){
        int area=length*width;
        return area;
    }
    int Square(){
        int area=side*side;
        return area;
    }
    public static void main(String[] args){
        
        Rectangle m1=new Rectangle();
        System.out.println(m1);
        int l=10,b=20;
        m1.getdata(l,b);
        int area1=m1.rectarea();
        int area2=m1.Square();
        System.out.println(area1);
        System.out.println(area2);
    }
}
