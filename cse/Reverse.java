import java.util.*;
public class Reverse {
    int n;
    public static int rev(int n){
        int rev=0;
        while (n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Reverse r1=new Reverse();
        //r1.n=sc.nextInt();
        float f=56.98f;
        int n=sc.nextInt();
        int reverse=rev(n);
        System.out.println("Reverse of a number : "+reverse);
        System.out.println(f);
        sc.close();

    }
}
