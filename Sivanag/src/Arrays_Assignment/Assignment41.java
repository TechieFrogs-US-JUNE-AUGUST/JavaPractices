//Concatinate two arrays
package Arrays_Assignment;

public class Assignment41 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6};
        int[] array2={7,8,9,10};
        int[] resultArray= new int[array1.length+array2.length];
       for(int i=0;i<array1.length;i++){
            resultArray[i]=array1[i];
           
        }
        for(int j=0;j<array2.length;j++) {
            resultArray[array1.length+j]=array2[j];
           
        }
        Assignment1.displayArray(array1);
        Assignment1.displayArray(array2);
        Assignment1.displayArray(resultArray);
    }
    
    
}
