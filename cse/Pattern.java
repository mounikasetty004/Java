public class Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=(n*2)-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=(n*2)-2;i++){
            for(int j=1;j<=(n*2)-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
