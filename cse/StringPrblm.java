import java.util.*;
//import java.math.*;
//import java.io.*;

class StringPrblm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s="aaabccdeaaaaa";
        // char[] ch=s.toCharArray();
        // char ch1='a';
        // String ch2=" ";
        // for(int i=0;i<s.length();i++){
        //     if(ch[i]==ch1){
        //         ch2+="";
        //     }
        //     else{
        //         ch2+=ch[i];
        //     }
        // }
        // System.out.print(ch2);
        // String res=new String(ch);
        // System.out.println(res);
        // String s=sc.nextLine();
        // String[] s1=s.split(" ");
        // int n=s1.length;
        // String s2=" ";
        // for(int i=0;i<n;i++){
        //     s1[i]=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1).toLowerCase();
        // }
        // for(int i=0;i<n;i++){
        //      s2+=s1[i]+" ";
        // }
        // System.out.println(s2.trim());
        //palindrome
        // String s=sc.nextLine();
        // char[] ch=s.toCharArray();
        // int n=ch.length;
        // String res=new String();
        // for(int i=n-1;i>=0;i--){
        //     res+=ch[i];
        // }
        // if(res.equals(s)){
        //     System.out.println("palindrome");
        // }
        // else{
        //     System.out.println("not a palindrome");
        // }
        //score ofa string
        // String s=sc.nextLine();
        // int n=s.length();
        // int score=0;
        // for(int i=0;i<n-1;i++){
        //     int x=s.charAt(i);
        //     int y=s.charAt(i+1);
        //     score+=Math.abs(x-y);
        // }
        // System.out.println(score);
        //1.1.1.1
        //1[.]1[.]1[.]1
        // String s=sc.nextLine();
        // char[] ch=s.toCharArray();
        // int n=s.length();
        // String res=new String();
        // res=s.replaceAll(".","[.]");
        // for(int i=0;i<n-1;i++){
        //     char x=s.charAt(i);
        //     if(x=='.'){
        //         res=s.replace(".","[.]");
        //     }
        // }
        // System.out.print(res);
    
        // String[] s={"++x","x++","--x"};
        // int x=0;
        // for(String s1:s){
        //     if(s1.equals("x++")||s1.equals("++x")){
        //         x+=1;
        //     }
        //     else{
        //         x-=1;
        //     }
        // }
        // System.out.println(x);
        // int num=sc.nextInt();
        // int c=0;
        // while(num!=0){
        //     if(num%2==0){
        //         num=num/2;
        //         c++;
        //     }
        //     else{
        //         num=num-1;
        //         c++;
        //     }
        // }
        // System.out.println(c);
        // int[] arr=new int[5];
        // int target=2;
        // int c=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target)
        //     c++;
        // }
        // System.out.println(c);

        // int n=sc.nextInt();
        // int org=n;
        // int rev=0;
        // while(n>0){
        //     int rem=n%10;
        //     rev=rev*10+rem;
        //     n/=10;
        // }
        // System.out.println(rev);
        // if(rev==org){ 
        // System.out.println("palindrome");
        // }
        // else{
        // System.out.println("not a palindrome");
        // }
        // sc.close();
        // String s=sc.nextLine();
        // char[] s1=s.toCharArray();
        // for(int i=0;i<s1.length;i++){
        //     if(s1[i].isUpperCase()){
        //         s1[i]=s[i].toLowerCase();
        //     }
        //     else{
        //         word=s.charAt(i).toLowerCase();
        //     }
        // }


        String s=sc.nextLine();
        String s1=sc.nextLine();
        int n=0,n1=0;
        for(int i=0;i<s.length();i++){
            n+=(int)s.charAt(i);
        }
        for(int i=0;i<s1.length();i++){
            n1+=(int)s1.charAt(i);
        }
        int res=n-n1;
        char c=(char)(res);
        System.out.println(c);
        sc.close();


    }
}