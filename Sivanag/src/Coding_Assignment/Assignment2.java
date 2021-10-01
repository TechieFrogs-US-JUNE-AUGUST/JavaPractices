package src.Coding_Assignment;

public class Assignment2 {
    static void arraysCompare(int[] array1,int[] array2)
    {
        int[] sumArray=new int[array1.length];
        int[] productArray=new int[array1.length];
        if(array1.length!=array2.length)
        System.out.println("Two arrays length is not same");
        else
        {
            int k=0;
            for(int i=0;i<array1.length;i++)
            {
                sumArray[i]=array1[i]+array2[i];
                productArray[i]=array1[i]*array2[i];
                if(sumArray[i]==productArray[i])
                {
                    k++;
                }
            }
            if(k==array1.length)
            {
                System.out.println("Two Arrays sum and product is same");
            }
            else
            System.out.println("Two Arrays sum and product is not same");

        }      
    }
    public static void main(String[] args) {
        int[] array1={2,2,2};
        int[] array2={2,2,2};
        arraysCompare(array1, array2);   
    } 
    
}
