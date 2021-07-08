import java.util.Scanner;
public class DiamondTriangle {
    public static void main(String[] args) {
        int rows,i,j,space=1;
        System.out.println("Enter Number of Rows : ");
        Scanner s=new Scanner(System.in);
        rows=s.nextInt();
        space=rows-1;
        for(i=1;i<=rows;i++){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(j=1;j<=2*i-1;++j){
                System.out.print("*");
            }
            System.out.println("");
        }
        space=1;
        for(i=1;i<=rows-1;i++){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            space++;
            for(j=1;j<=2*(rows-i)-1;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
