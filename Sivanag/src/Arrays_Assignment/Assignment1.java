//Copy all Element of one array to another array
package Arrays_Assignment;

import java.util.Scanner;

public class Assignment1 {
    public static int[] assignArray()
    {
        Scanner scannerObj= new Scanner(System.in);
        System.out.print("Enter Length of an Array : ");
        int size=scannerObj.nextInt();
        System.out.println("Enter Array Elements");
        int[] array1=new int[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=scannerObj.nextInt();
        }
        scannerObj.close();
        return array1;
    }
    static void displayArray(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    static void displayArray(String[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array1= {1,2,5,6,7,8};
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("Array1");
        displayArray(array2);
        System.out.println("Copy Array1 to Array2");
        displayArray(array2);

}
    
}
