//COPYING A JAVA ARRAY
/* public class ArraysMultidimensional2 {
    public static void main(String[] args) {
       char sourceArray[]= {'a','b','c','d','e'};
       //char destArray[]= new char[10];
       char destArray[]= {'1','2','3','4','5'};

      // System.arraycopy(sourceArray, 0, destArray, 0, 5);         //arraycopy(src, srcPos, dest, destPos, length)
     //  System.out.println(String.valueOf(destArray));
       System.arraycopy(sourceArray, 0, destArray, 1, 4);
       for(int i=0; i<destArray.length; i++){
         System.out.println(destArray[i]);
     }
    }
}        */


//CLONING AN ARRAY--- "deep copy" happens with 1D, while in 2D it will be "shallow copy" which means only references are copied
 public class ArraysMultidimensional2{
    public static void main(String[] args) {
        char sourceArray[]= {'a','b','c','d','e'};

        char cloneArray[]= sourceArray.clone();
         cloneArray[0]= 'v';                           //In 1D array we changed value while cloning

         System.out.println("cloned 1D array");
         for(int i=0; i<cloneArray.length; i++){      
            System.out.println(cloneArray[i]);        //so it prints the array with changed value in 1D array here  
        }
        System.out.println("Original 1D array");     //but after cloned we will get the original array values in 1D 
        for(int i=0; i<sourceArray.length; i++){
            System.out.println(sourceArray[i]);
    }
}    
 }     


//In 2D cloning of array, if we did change one of the value it doesn't reflect with old values again
/* public class ArraysMultidimensional2{
    static void display(int myNewArray[][]){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(myNewArray[i][j]+" ");
            }
            System.out.println();   
        }
}
    public static void main(String[] args) {
        int myArray[][]={{1,2},{3,4}};

        int cloneArray[][]= myArray.clone();
        cloneArray[0][0]=10;                            //In 2D we changed one of the value while cloning

        System.out.println("Cloned array");            //so it prints the array with changed value in 2D array here
          display(cloneArray);

          System.out.println("Old array");             //but after cloned we won't get the original array values in 2D..we will get the cloned values only
          display(myArray);
        }
    }        */
