package Arrays_Assignment;

public class Assignment13 {
    public static void main(String[] args) {
        int[] array1= Assignment1.assignArray();

        System.out.println("Given Array");
        Assignment1.displayArray(array1);
        int temp=array1[array1.length-1];
                  
        for(int i=array1.length-1;i>0;i--)
        {
            array1[i]=array1[i-1];
            
        }
        array1[0]=temp;
        System.out.println("Right Rotated Array ");
        Assignment1.displayArray(array1);
    }
    
}
