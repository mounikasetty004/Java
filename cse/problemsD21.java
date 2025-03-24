import java.util.*;
//import java.math.*;
class problemsD21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //to count maximum number of words in the string in array
        // String[] sarr=new String[3];
        // for(int i=0;i<sarr.length;i++){
        //     sarr[i]=sc.nextLine();
        // }
        // int hc=0;
        // int index=0;
        // for(int i=0;i<sarr.length;i++){
        //     String words=sarr[i];
        //     String[] word=words.split(" ");
        //     int len=word.length;
        //     if(len>hc) {
        //         hc=len;
        //         index=i;
        //     }
            
        // }
        // System.out.println(hc);
        // System.out.println(index);
        // sc.close();
        

        // way to long words
        // String s=sc.next();
        // int n=s.length();
        // String abr=""; 
        // if(n<10){
        //     System.out.println(s);
        // }
        // else{
        //     abr+=s.charAt(0);
        //     abr+=n-2;
        //     abr+=s.charAt(n-1);
        //     System.out.println(abr);
        // }



        //REVERSE WORDS 
        String s=sc.nextLine();
        String s1=" ";
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            StringBuffer sb=new StringBuffer(words[i]);
            sb.reverse();
            s1+=sb+" ";
        }
        System.out.println(s1);
        sc.close();
    }
}