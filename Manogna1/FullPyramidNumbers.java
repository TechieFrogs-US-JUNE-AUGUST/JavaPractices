public class FullPyramidNumbers {
    public static void main(String[] args) {
        int l,k;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i)*2;j++){
                System.out.print(" ");
            }
            for( l=2;l<=i;l++) {

                System.out.print(" " +(l+i-2));
            }
            for(k=i;k>=1;k--) {
                System.out.print(" " + (k+i-1));
                }
            System.out.println( );
        }
    }
}
