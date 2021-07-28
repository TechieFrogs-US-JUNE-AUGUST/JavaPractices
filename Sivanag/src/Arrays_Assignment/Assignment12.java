package Arrays_Assignment;
public class Assignment12
{
    public static void main(String[] args) {
        int[] array1= Assignment1.assignArray();
        int sum=0;
        for(int i=0;i<array1.length;i++)
        {
            sum=sum+array1[i];

        }
        System.out.println("Given Array");
        Assignment1.displayArray(array1);
        System.out.println("Sum of all numbers in Array is : " + sum);
    }
}