package Arrays;
import java.util.Scanner;
public class Arrays15SortElementsInDescendingOrder 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of string");
        int len =scanner.nextInt();
        int array[]=new int[len];
        System.out.println("Enter elements of arrays ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        int temp=0;
        System.out.println("Input array");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Elements of an array in descending order");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]<array[j])
                {
                temp =array[i];
                array[i]=array[j];
                array[j]=temp;
                }
            }
            System.out.print(array[i]+" ");
        }
            scanner.nextInt();
    }
    
}
