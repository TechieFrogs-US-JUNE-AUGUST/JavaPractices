public class Array1Copy{    
    public static void main(String[] args){ 
        int [] array1 = new int [] {1, 2, 3, 4, 5};       //initializing an array    
        int array2[] = new int[array1.length];         // initializing 2nd array with 1st array length  
        for (int index = 0;index < array1.length; index++){    
            array2[index] = array1[index];                    // copying all the elements to 2nd array
        }          
        System.out.println("Elements of original array: "); 
        display(array1);
        System.out.println("Elements of copied array: "); 
        display(array2);
    }
        //for (int index = 0; index < array1.length; index++) {     
        //   System.out.print(array1[index] + " ");    
        //}     
            
        //System.out.println();     
        //System.out.println("Elements of new array: ");    
        //for (int index = 0; index < array2.length; index++) {     
        //   System.out.print(array2[index] + " ");    
        //}     
    static void display(int displayArray[]){ //method for display. we can call same method for both 
        for (int index = 0; index < displayArray.length; index++) {
            System.out.print(displayArray[index] + " "); 
        }
        System.out.println();
    }    
}