public class String2
 {
    public static void main(String[] args) 
    {
        String array[]={"hi", "HI", "team", "a","b"};                                   // initiating array of strings

        System.out.println("number of strings in the array are: "+array.length);      // used to print array length.
        
        for(int i=0; i<(array.length-1); i++)                                       // initializing int value to compare index values in the string.
        {
            for( int j=i+1;j<array.length;j++)                                    // initializing int value to compare index values  in the string.
            {
                if( array[i].compareToIgnoreCase(array[j])>0)                   // used for coparing two arrays
                {
                    String temp=array[i];                                     // initializing temp variable to store elements of array[i]
                    array[i] = array[j];                                     // swapping array[i] with array[j]
                    array[j] = temp;                     
                }
            }
        }
      System.out.println("elements in lexicographical order : ");

        for( int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    } 
}