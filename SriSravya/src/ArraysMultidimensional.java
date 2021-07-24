import java.util.Scanner;
    public class ArraysMultidimensional {
    public static void main(String[] args) {
      //  int multiArray[2][3];                                   //declaration of multidimensional array
        int multiArray[][]= new int[2][3];                       //using instance declaration
       // int multiArray[][]= {{0,1,2}, {3,4,5}, {6,7,8}};           //we can declare like this also
        multiArray[0][0]= 1;
        multiArray[0][1]= 2;
        multiArray[0][2]= 3;
        multiArray[1][0]= 4;
        multiArray[1][1]= 5;
        multiArray[1][2]= 6;   

        for(int i=0; i<3; i++){                               //for rows
            for(int j=0; j<3; j++) {                       //for columns
                System.out.print(multiArray[i][j]+" ");     
            }
            System.out.println();
    }
  }
}        


//USING SCANNERS FOR INPUT FROM USER

/* public class ArraysMultidimensional{
    public static void main(String[] args) {
        int multiArray[][]= new int[2][3];
        Scanner scannerObj=new Scanner(System.in);
        for(int i=0; i<2; i++){               
            for(int j=0; j<3; j++) { 
                multiArray[i][j]= scannerObj.nextInt();
        }
    }
  }
}         */


//PASSING MULTIDIMENSIONAL ARRAY TO METHOD

/* public class ArraysMultidimensional{
    static void display(int methodArray[][]){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(methodArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int multiArray[][]= {{1,2},{3,4}};
        display(multiArray);
    }
}       */


//RETURNING AN ARRAY

/* public class ArraysMultidimensional{
    static int[][] display(){                 //display() method returns an array
        return new int[][]{1,3};
    }
    
    public static void main(String[] args) {
        int[][] arr=display();                         //calling display() method which returns an array
       for(int i=0; i<2; i++){
           for(int j=0; j<2; j++)
        System.out.print(arr[i][j]+" ");
       }
       System.out.println();
    }
}             */


//JAGGED ARRAY---having different number of columns
/*public class ArraysMultidimensional{
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        
        //int multiArray[][]={{1,2},{3,4,5}};         //declaration with 2 rows and 3 columns by directly giving i/p values
        int multiArray[][]= new int[2][];             //declaration without giving i/p values
        multiArray[0]= new int[2];                  //1st row with 2 columns
        multiArray[1]= new int[3];                  //2nd row with 3 columns

        //nested for loop to read i/p from user
        for(int i=0; i<multiArray.length; i++){
            for(int j=0; j<multiArray[i].length; j++){          //goes to every row and checks until how many columns are there for every row
               multiArray[i][j]= scannerObj.nextInt();     
            }
        }
        //nested for loop to print the values
        for(int i=0; i<multiArray.length; i++){
            for(int j=0; j<multiArray[i].length; j++){
                System.out.print(multiArray[i][j]+" ");
                }
                System.out.println();
            }
    }
}     */      



//CLASS NAME OF AN ARRAY
/* public class ArraysMultidimensional{
    public static void main(String[] args) {
        int multiArray[][]={{1,2},{3,4}};
        Class c= multiArray.getClass();             //for getting the class name of array
        String s= c.getName();
        System.out.println(s);                //for printing the class name of array
    }
}              */