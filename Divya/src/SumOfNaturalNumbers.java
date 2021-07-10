               //sum of given natural numbers by using for loop
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        int n,sum=0;
        System.out.println("enter number of natural numbers");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
     /*   for(int i=0;i<=n;i++){
            sum=sum+i; }
        System.out.println("sum of given natural numbers:"+sum);
    }
}*/
                     // sum of given natural numbers by using while loop
                int i=0;
                while(i<=n){
                    sum=sum+i;
                    i++;
                }
                System.out.println("sum of given natural numbers:"+sum);
                s.close();
                }
    }