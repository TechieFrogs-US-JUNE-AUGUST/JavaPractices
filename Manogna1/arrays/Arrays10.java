package arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int array[]=new int[]{33,44,55,66,77,93};
        int minimum=array[0];//assign first element of an array with minimum
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<minimum)//compares elements of array with minimum
            minimum=array[i];//assign smallest value to minimum
        }
        System.out.println("Smallest element in the array : " +minimum);
    }
    
}
