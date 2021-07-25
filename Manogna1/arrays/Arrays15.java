package arrays;

public class Arrays15 {
    public static void main(String[] args) {
        int array[]={12,25,37,85,97};
        int temporary=0;//Assign a temporary variable with 0
        System.out.println("Arrays in Descending Order :");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]<array[j])//Checks the condition
                {
                    temporary=array[i];
                    array[i]=array[j];
                    array[j]=temporary;//sort the values in descending order
                }
            }
            System.out.println(array[i]);
        }
    }
    
}
