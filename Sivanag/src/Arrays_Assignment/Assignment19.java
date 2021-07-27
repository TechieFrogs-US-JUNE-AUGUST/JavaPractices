//Remove Duplicate Elements from Array
package Arrays_Assignment;

public class Assignment19 {
    public static void main(String[] args) {
        int[] array1= Assignment1.assignArray();
        int[] array2=new int[array1.length];
        int k=0;
        array2[k]=array1[0];
        k++;
       for(int i=1;i<array1.length;i++)
       {
           int c=0;
           for(int j=0;j<i;j++)
           {
               if(array1[i]==array1[j])
               c++;
           }
           if(c==0)
           {
           array2[k]=array1[i];
           k++;
           }
       }
       Assignment1.displayArray(array2);
    }
    
}
