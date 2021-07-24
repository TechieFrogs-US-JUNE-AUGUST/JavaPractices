//Copy all Element of one array to another array
package Arrays_Assignment;
public class Assignment1 {
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
