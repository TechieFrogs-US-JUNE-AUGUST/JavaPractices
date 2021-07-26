package Practice;



import java.util.Scanner;

public class s1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] array= new int[55];
        int[] duplicate=new int[55];
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        System.out.println("Enter Elements in an Array :");
        
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            duplicate[i]=-1;
        }
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(array[i]==array[j])
                {
                    count++;
                    duplicate[j]=0;
                }
            }
            if(duplicate[i]!=0)
            {
                duplicate[i]=count;
            }
        }
        System.out.println("Duplicate elements in an array :");
        for(int k=0;k<n;k++)
        {
            if(duplicate[k]!=0)
            {
                System.out.println(" Number " + array[k] + " occur " + duplicate[k] + " times " );
            }
        }
        sc.close();
    }
}