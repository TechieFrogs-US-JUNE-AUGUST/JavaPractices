package arrays;

public class Arrays9 {
    public static void main(String[] args) {
        int array[]= new int[]{55,57,89,94}; //initialize an array
        int max=array[0];//initialize max with first element of row
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)//compare elements of array with max
            {
                max=array[i]; //assign largest element to max
            }

        }
        System.out.println("Largest element present in given array : " +max);
        
    }
    
}
