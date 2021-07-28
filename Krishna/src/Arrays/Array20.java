public class Array20 
{
    public static void main(String[] args) {
        int array[]={1,2,26,69,55};
        System.out.println("EVen Numbers :");
         for(int i=0;i<array.length;i++)
            {
                if(array[i]%2==0)                                       //if the remainder is zero it is even
                {
                    System.out.println(array[i]);
                }
            }
          System.out.println("Odd Numbers :");  
          for(int i=0;i<array.length;i++)
            {
                if(array[i]%2!=0)                                     //if it is not divisible bye 2 it is odd
                {
                    System.out.println(array[i]);
                }
            }
    }
}