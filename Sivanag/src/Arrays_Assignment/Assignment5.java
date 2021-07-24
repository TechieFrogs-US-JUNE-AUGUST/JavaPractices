//Print the Elements of Array
package Arrays_Assignment;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.print("Array Size : ");
        int size=scannerObj.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] array1=new int[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=scannerObj.nextInt();
        }
        Assignment1.displayArray(array1);
        scannerObj.close();

    }
    
}
