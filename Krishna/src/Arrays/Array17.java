public class Array17                                      // to find second largest number in an array
    {
        public static int secondLargestNumber(int[] array,int length)
        {
            int temporary=0;
    
            System.out.println("numbers present in the array are:");
    
            for(int i=0;i<length;i++)
            {
                for(int j=i+1;j<length;j++)
                {
                    if(array[i]>array[j])              //sorting array in ascending order 
                    {
                        temporary=array[i];
                        array[i]=array[j];
                        array[j]=temporary;                            
                    }
                } 
                System.out.println(array[i]);         // prints the sorted array. 
            }
            
            return array[length-2];                  //returns the number present in the (length-2) location of the array; since last number location will be (length-1). 
        }
        public static void main(String[] args)
         {
            int array1[]={1,40,40,67,69,14,20};
           
            System.out.println("total no of numbers in the array are: " +array1.length);          //prints the array length.
    
            System.out.println("Second Largest Number is : " +secondLargestNumber(array1,array1.length));
        }
    }