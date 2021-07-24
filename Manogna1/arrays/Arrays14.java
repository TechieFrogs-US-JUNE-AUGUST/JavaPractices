package arrays;


public class Arrays14 {
    public static void main(String[] args) {
        int array[]={35,54,75,11,21};
        int temporary=0; //Assign a temporary variable with 0
        System.out.println("Array in Ascending order :");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])//checks the condition
                {
                    temporary=array[i];//sort the values in ascending order
                    array[i]=array[j];
                    array[j]=temporary;
                }
            }
            
            System.out.println(array[i]);
        }
          
        
    }
    
}
