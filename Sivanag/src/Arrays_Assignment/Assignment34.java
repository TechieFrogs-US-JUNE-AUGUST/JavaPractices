package Arrays_Assignment;

public class Assignment34 {
    public static double averageArray(int[] ar)
    {
        int sum=0;
        for (int i : ar) {
            sum+=i;
        }
        return sum/ar.length;
    }
    public static void main(String[] args) {
        int[] array1=Assignment1.assignArray();
        Assignment1.displayArray(array1);
        System.out.println("Average of Array Elements is : " + averageArray(array1));


    }
    
}
