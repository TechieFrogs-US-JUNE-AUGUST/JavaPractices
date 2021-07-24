package arrays;

public class Arrays12 {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5,6,7,8,9};
        int sum=0; 
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];//to caluculate sum of elements
        }
        System.out.println("Sum of elements in an Array : " +sum);
    }
    
}
