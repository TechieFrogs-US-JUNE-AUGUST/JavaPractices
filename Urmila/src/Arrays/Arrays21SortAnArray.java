package Arrays;
import java.util.Scanner;

public class Arrays21SortAnArray 
{
    public static void main(String[] args)
    { 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  the length of array");
        int len=scanner.nextInt();
        int[] array=new int[len];
        System.out.println("Enter elements of array");
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("original array");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(" Even numbers of Given array");
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        System.out.println(" Odd numbers of Given array");
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2!=0)
            {
                System.out.print(array[i]+" ");
            }
        } 

    }
    
}
