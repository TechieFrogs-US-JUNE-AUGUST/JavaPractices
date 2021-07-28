package Arrays_Assignment;

public class Assignment20 {
    public static void main(String[] args) {
        int[] array1=Assignment1.assignArray();
        System.out.println("Given Array");
        Assignment1.displayArray(array1);
        int[] arrayEven=new int[array1.length]; 
        int[] arrayOdd=new int[array1.length]; 
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]%2==0)
            {
                arrayEven[i]=array1[i];
            }
            else
            arrayOdd[i]=array1[i];
       }
       System.out.println("EVen Numbers in a Given Array");
      for(int b=0;b<arrayEven.length;b++)
      {
          if(arrayEven[b]!=0)
          System.out.print(arrayEven[b] + " ");
      }
      System.out.println();
       System.out.println("Odd Numbers in a Given Array");
       for(int b1=0;b1<arrayOdd.length;b1++)
       {
           if(arrayOdd[b1]!=0)
           System.out.print(arrayOdd[b1] + " ");
       }
       System.out.println();
    }
  
    
}
