package arrays;

public class Arrays19 {
    public static void main(String[] args) {
        int array[]={12,14,19,13,14,19,12,63,45};
        int length=array.length;
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(array[i]==array[j])//if it finds the duplicate element
                {
                    array[j]=array[length-1];// that index value is assigned to last value 
                    length--;   //and reduce the length of the array            
                }
            }
        }
        System.out.println("New Array without Duplicate Elements");
        for(int i=0;i<length;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
