import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        
        //bubble sort
        //int[] arr={25,50,5,10,20};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int temp=0;
        //         if(arr[i]>arr[j]){
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // // for(int i=0;i<arr.length;i++){
        // //     System.out.print(arr[i]+" ");
        // // }
        // System.out.println(Arrays.toString(arr));


        //selection sort
        // int[] arr={25,50,5,10,20};
        // for(int i=0;i<arr.length-1;i++){
        //     int min=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[min]) min=j;
        //     }
        //     int temp=arr[i];
        //     arr[i]=arr[min];
        //     arr[min]=temp;     
        // }
        // System.out.println(Arrays.toString(arr));


        //insertion sort
        // int[] arr={25,50,5,10,20};
        // for(int i=0;i<arr.length;i++){
        //     int j=i;
        //     while(j>0 && arr[j]<arr[j-1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp; 
        //             j--;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        // merge sort
        int[] arr={1,2,3,4,5};
        int[] brr={4,5,7,8,9};
        int n=arr.length;
        int m=brr.length;
        int[] crr=new int[n+m]; 
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr[i]<=brr[j]) {
                crr[k]=arr[i];
                i++;
            }
            else {
                crr[k]=brr[j];
                j++;
            }
            k++;
        }
        if(i>=n){
            while(j<m){
                crr[k]=brr[j];
                j++;
                k++;
            }
        }
        if(j>=m){
            while(i<n){
                crr[k]=arr[i];
                i++;
                k++;
            }
        }
        System.out.println(Arrays.toString(crr));


       
    }
}
