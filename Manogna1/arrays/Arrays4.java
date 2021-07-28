package arrays;

public class Arrays4 {
    public static void main(String[] args) {
       int array[]={1,2,4,2,3};
       System.out.println("Duplicate elements in an Array :");
       for(int i=0;i<array.length;i++)
       {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                System.out.println(array[i]); 
            }
            
       }
    }
    
}
