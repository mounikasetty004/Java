public class PtternD21 {
    public static void main(String[] args) {
        int n=6;
    //     *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    // * * * * * *
    //     // for(int i=0;i<n;i++){
    //     //     for(int s=0;s<=n-i;s++){
    //     //         System.out.print(" ");
    //     //     }
    //     //     for(int j=0;j<i;j++){
    //     //         System.out.print("* ");
    //     //     }
    //     //     System.out.println();
    //     // }

    //     * * * * * *
    //     * * * * *
    //      * * * *
    //       * * *
    //        * *
    //         *

    //     // for(int i=0;i<n;i++){
    //     //     for(int s=0;s<i;s++){
    //     //         System.out.print(".");
    //     //     }
    //     //     for(int j=0;j<n-i;j++){
    //     //         System.out.print("* ");
    //     //     }
    //     //     System.out.println();
    //     // }
    //     * * * * * *
    //     * * * * * *
    //    * * * * * *
    //   * * * * * *
    //  * * * * * *
    // * * * * * *
    //  * * * * * *
    //   * * * * * *
    //    * * * * * *
    //     * * * * * *
    //      * * * * * *

    //     for(int i=0;i<n;i++){
    //         for(int s=0;s<=n-i;s++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<n;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=1;i<n;i++){
    //         for(int s=0;s<=i+1;s++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<n;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }


            // for(int i=0;i<n;i++){
            //     for(int s=0;s<=n-i;s++){
            //         System.out.print(" ");
            //     }
            //     for(int j=0;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            // for(int i=1;i<n;i++){
            //     for(int s=0;s<i+1;s++){
            //         System.out.print(" ");
            //     }
            //     for(int j=i;j<n;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }


            
            // 111111
            // 111122
            // 111333
            // 114444
            // 155555
            // 666666    

            for(int i=0;i<n;i++){
                for(int s=0;s<n-i-1;s++){
                    System.out.print("1");
                }
                for(int j=0;j<=i;j++){
                    System.out.print(i+1);
                }
                System.out.println();
            }
    }
}
