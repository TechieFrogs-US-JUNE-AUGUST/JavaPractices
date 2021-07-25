//Left Rotation of Array
package Arrays_Assignment;
public class Assignment3 {
    public static void main(String[] args) {
        int[] array1={5,6,7,1,2,3};
        System.out.println("Given Array");
        Assignment1.displayArray(array1);
        int temp=array1[0];
        for(int i=0;i<array1.length-1;i++)
        {
            array1[i]=array1[i+1];

        }
        array1[array1.length-1]=temp;
        System.out.println("Left Rotation of Array");
        Assignment1.displayArray(array1);
    }
    
}
