package Arrays;
import java.util.Scanner;
public class Arrays4DuplicateElementsOfArray 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of array");
        int length=scanner.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Duplicate elements in an Array are");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.print(+array[i]+" ");
                }
               
            }
        }
    }
    
}
