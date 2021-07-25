public class Array7and8 
{
    public static void main(String[] args) 
    {
        int array[]=new int[]{1,2,3,4,5,6,8};
        
        System.out.println("elements in the array are: ");
        for(int i=0;i<array.length; i++)
        {
            System.out.println(array[i]);
        }
       System.out.println("elements in even position of the array are: " );

       for(int i=1;i<array.length;i+=2)                         // pointer starts at index 1 i.e value =2
       { 
        System.out.println(array[i]);                          //prints even position elements in the array
       }
       System.out.println("elements in odd position of the array are: " );

       for(int i=0;i<array.length;i+=2)                        //pointer starts at index 0 i.e  value = 1
       { 
        System.out.println(array[i]);                          //prints odd position elements in the array
       }
    }
}