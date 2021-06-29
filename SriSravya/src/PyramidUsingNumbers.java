import java.util.Scanner;
public class PyramidUsingNumbers {

    public static void main(String[] args){
        int n,i,j,k=0,count=0,count1=0;
        System.out.println("ENter n value: ");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();

        for(i=1;i<=n;i++,k=0){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
                count++;
            }
            while(k!=2*i-1){
                if(count<=n-1){
                    System.out.print((k+i)+" ");
                    count++;
                }
                else{
                    count1++;
                    System.out.print((i+k-2*count1)+" ");
                }
                k++;
            }
            count1=count=k=0;
            System.out.println( );
        }
    }

}
