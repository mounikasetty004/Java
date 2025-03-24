public class searching {
    public static void main(String[] args) {
        // int[] arr={2,3,4,5,8,7,3};
        // int ele=8;
        // boolean flag=false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==ele){
        //         // flag=true;
        //         // break;
        //         System.out.println("element found at index:"+arr[i]);
        //     }
        // }
        // // System.out.println(flag);

         // binary search
        int[] arr={1,2,3,4,5,6,7};
        int l=arr[0];
        int r=arr[arr.length-1];
        int ele=2;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==ele){
                System.out.print(ele+" is found");
                break;
            }
            else if(arr[mid]<ele){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
 
    }
}
