import java.util.*;
//import java.math.*;
class problems{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //number of employees reaching the target hours
        // int[] arr={0,1,2,3,4};
        // int target=2;
        // int c=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>=target)
        //     c++;
        // }
        // System.out.println(c);

        //getting even length of word
        // String s="Welcome to the qiscet, main program";
        // String ch[]=s.split(" ");
        // int n=ch.length;
        // for(int i=0;i<n;i++){
        //     int l=ch[i].length();
        //     if(l%2==0){
        //         System.out.println(ch[i]);
        //     }
        // }
    
        // String s=sc.nextLine();
        // char ch[]=s.toCharArray();
        // Arrays.sort(ch);
        // String s1=new String(ch);
        // System.out.print(s1);
        
        //anagram
        // String s1=sc.next();
        // char ch1[]=s1.toCharArray();
        // String s2=sc.next();
        // char ch2[]=s2.toCharArray();
        // Arrays.sort(ch1);
        // Arrays.sort(ch2);
        // if(Arrays.equals(ch1,ch2))
        // System.out.println("anagram");
        // else
        // System.out.println("not anagram");



        String s=sc.next();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            if(i%2!=0){
                char temp=ch[i-1];
                ch[i-1]=ch[i];
                ch[i]=temp;
            }
        }
        System.out.println(ch);


        //baloon problem
        // String s=sc.next();
        // int b=0,a=0,l=0,o=0,n=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='b')
        //     b=b+1;
        //     else if(s.charAt(i)=='a')
        //     a=a+1;
        //     else if(s.charAt(i)=='l')
        //     l=(l+1);
        //     else if(s.charAt(i)=='o')
        //     o=(o+1);
        //     else if(s.charAt(i)=='n')
        //     n=n+1;
        // }
        // int[] arr={1,2,1,4,5,1,3,2};
        // int c1=0,c2=0,c3=0,c4=0,c5=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==1) c1++;
        //     else if(arr[i]==2) c2++;
        //     else if(arr[i]==3) c3++;
        //     else if(arr[i]==4) c4++;
        //     else if(arr[i]==5) c5++;
        // }
        // System.out.println(arr[0]+" "+c1);
        // System.out.println(arr[1]+" "+c2);
        // System.out.println(arr[2]+" "+c3);
        // System.out.println(arr[3]+" "+c4);
        // System.out.println(arr[4]+" "+c5);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[arr.length-i-1]);
        // }
        // int[] arr1={1,2,1,4,5,1,3,2};
        // for(int i=0;i<arr1.length;i++){
        //     if(i%2!=0){
        //         System.out.println(arr1[i]);
        //     }
        // }

        // int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // int maxi=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr.length;j++){
        //     if(arr[i][j]>maxi) maxi=arr[i][j];
        // }
        // System.out.println(maxi);
    //}
    sc.close();
    }
}