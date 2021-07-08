public class PascalTriangle {
    public static void main(String[] args) {
        int i,j,k;
        int l=0;
        for(i=0;i<6;i++){
            for(j=1;j<=6-i;j++)
                System.out.print(" ");
            for(k=0;k<=i;k++) {
                if (k == 0 || i == 0)
                    l = 1;
                else
                    l = l * (i - k + 1) / k;
                System.out.print("    " + l);
            }
            System.out.println( );

            }
        }
    }

