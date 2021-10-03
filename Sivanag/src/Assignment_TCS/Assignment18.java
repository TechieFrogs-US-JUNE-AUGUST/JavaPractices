

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter position of number in the series factor 2,3,5");
         int pos=sc.nextInt();
         int[] array=new int[pos];
         int k=2;
         array[0]=1;
         for(int i=1;i<pos;i++)
         {
            while((k%2!=0) && (k%3!=0) && (k%5!=0))
            {
                k++;
            }
            array[i]=k;
            k++;
         }
         System.out.println(array[pos-1]);
         sc.close();
    
    }
}
