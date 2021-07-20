import java.util.Scanner;

/* public class Arrays {
     public static void main(String[] args) {
       int arr[]=new int[10];         //instantisation of array
       arr[0]=10;
       arr[1]=20;
       System.out.println(arr[1]);

       int a[]={1,2,3,4};                    //if we have i/p values we decalre them using  {}
       for(int i=0; i<a.length; i++){
           System.out.print(a[i]+" ");                  //printing a value at each iteration of i
       }
    }
}           */

//USING FOR-EACH LOOP
/* public class Arrays{
    public static void main(String[] args) {
       // int arr[]={2,4,6,8};
       int arr[]=new int[5];

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter i/p numbers");
        for(int i=0; i<arr.length; i++){           //using for loop to take the i/p , here length is a property
           arr[i]=obj.nextInt();                   //scans the int value
        }

        for(int i:arr){                             //syntax is "for(datatype variable:name)""
            System.out.println("O/p numbers are: " +i);
        }
        for(int i=0; i<arr.length; i++){           //we can use normal for loop also
            System.out.println(arr[i]);
        }
    }
}   */


//PASSING ARRAY TO METHODS
/* public class Arrays{
    static void display(int arr[]){           //method with datatype and array in parameters
        System.out.println("My array values are: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);        //printing arr value at each iteration of i
        }
    }
    public static void main(String[] args) {
     //  int arr[]={1,2,3,4};                      //declared the i/p
       int arr[]=new int[5];                     //instantising the i/p using scanners

       Scanner obj=new Scanner(System.in);
       System.out.println("Enter i/p numbers");
       for(int i=0; i<arr.length; i++){           //using for loop to take the i/p , here length is a property
          arr[i]=obj.nextInt();                   //scans the int value
       }
       display(arr);                           //calling method with passing array variable
    }
}            */



//ANONYMOUS ARRAY
//you dont need to declare the array while passing an array to method
/* public class Arrays{
    static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        display(new int[]{1,2,3,4});               //passing anonymous array to method
    }
}       */



//RETURNING ARRAY
/* public class Arrays{
    static int[] display(){                 //display() method returns an array
        return new int[]{1,2};
    }
    
    public static void main(String[] args) {
        int arr[]=display();                         //calling display() method which returns an array
       for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
       }
    }
}          */



public class Arrays{

    static int[] someArray(){                 //someArray method returns an array
        return new int[]{1,2};
    }
    static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
         System.out.println(arr[i]); 
        }
     }
    
    public static void main(String[] args) {
    display(someArray());                        //calling display method with someArray method as arguments
  }   
}       
