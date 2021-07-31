package Practice;

public class Array_Rearrange
{
    static int[] arrayRearrange(int[] a)
    {
        int[] b= new int[a.length];
        int l=0;
             for(int j=0;j<a.length;j++)
        {
            if(a[j]!=0)
            {
                b[l]=a[j];
                l++;
            }
        }
        return b;
    }
    static void displayArray(int[] a)
    {
        for (int i : a) {
            System.out.print( i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array1={1, 2, 0, 4, 3, 0, 5, 0};
        displayArray(array1);
        displayArray(arrayRearrange(array1));
    }
}