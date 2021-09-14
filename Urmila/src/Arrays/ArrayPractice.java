package Arrays;
public class ArrayPractice 
{
    public static void main(String[] args)
     {
        /*Syntax to Declare an Array in Java
        dataType[] arr; (or) dataType []arr; (or)dataType arr[];  
        Instantiation of an Array in Java
        arrayRefVar=new datatype[size];  
        // Declaring Arrays
        dataType[] arrayName;
        dataType - int, char, double, byte, etc. or Java objects
        arrayName - it is an identifier
        int intArray[]; 
        or int[] intArray; 

      byte byteArray[];
      short shortsArray[];
      boolean booleanArray[];
      long longArray[];
      float floatArray[];
      double doubleArray[];
      char charArray[];*/
//initializing array without assigning Values:
      /*int [] array = new int[5];// initializing array
      for(int i= 0;i<5;i++) //printing the elements of array
      {
        System.out.println(array[i]);
      }*/ //print 00
// initializing array after a declaration:
   /*int [] array = new int[5];
   array= new int[]{1,2,3,4,5};// array initialization
   for(int i= 0;i<5;i++)
   {
   System.out.println(array[i]);
   }*/  // 1 2 3 4 5
//initializing array and assigning values
   /*int [] array = {10,11,12,14};
   for(int i= 0;i<5;i++)
   {
   System.out.println(array[i]);
   }*/ 
//  declare, instantiate, initialize  
     /* int a[]=new int[5];//declaration and instantiation  
      a[0]=10;            //initialization  
      a[1]=15;  
      a[2]=71;  
      a[3]=44;  
      a[4]=59;  
      for(int i=0;i<a.length;i++)  //length is the property of array  
      System.out.println(a[i]); */
//  using eachloop
    /* int arr[]={0,3,4,5};//printing array using for-each loop  
     for(int i:arr)  
     System.out.println(i); */ 
//Passing array to method
 /* static void min(int arr[])//creating a method which receives an array as a parameter 
  {  
  int min=arr[0];  
  for(int i=1;i<arr.length;i++)  
   if(min>arr[i])  
    min=arr[i];  
  System.out.println(min);  
  }   
  public static void main(String args[])
  {  
  int a[]={33,3,4,5};    //declaring and initializing an array  
  min(a);                 //passing array to method  //print 3*/
  /*double a[];
    a = new double[4];
    a[0] = 123456d;
    //System.out.println("Java double Array Example");
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Element at Index : "+ i + " " + a[i]);
        }
        int arr[]=new int[10];         //instantisation of array
         arr[0]=12;
         arr[1]=33;
         System.out.println(arr[0]); //prints 12
         System.out.println(arr[1]); //prints 33
         System.out.println(arr[0]+arr[1]); //prints 45
         // using for loop
         int a[]={1,2,};                    //if we have i/p values we decalre them using  {}
         for(int i=0; i<a.length; i++) 
         {
           System.out.print(a[i]+" "); 
         }*/
         //using each Loop
        
         /*int arr[]= {20,15,25};
         for(int i:arr)
         System.out.println(i);*/
         /*int[] age = {12, 4, 5}; // create an array
         System.out.println("Using for-each Loop:");
         for(int a : age)
         {
         System.out.println(a);
         }
        static void min(int arr[]){  
        //int min=arr[0];  
        int max=arr[0];
        for(int i=1;i<arr.length;i++)  
        //if(min>arr[i])  
        if(max>arr[i])
        //min=arr[i];  
        max= arr[i];
        //System.out.println(min);  
        System.out.println(max);
        }  */
        /

        /*//copy from array
          char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e' }; 
               char[] copyTo = new char[7];  
             
                 System.arraycopy(copyFrom, 2, copyTo, 0, 4);  
             
                 System.out.println(String.valueOf(copyTo));  */
     }
     }
     
  }
  }


