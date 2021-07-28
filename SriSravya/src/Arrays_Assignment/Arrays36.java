//TO ADD TWO MATRICES USING 2D ARRAYS
package Arrays_Assignment;

public class Arrays36 {
    public static void main(String[] args) {
            int a[][]= {{5,6,8},{7,8,6}};                 //a and b matrices should be of equal size for addition
            int b[][]= {{1,2,3},{3,4,2}};
    
            int c[][]= new int[2][3];           //c matrix of 2 rows and 3 columns is used for storing the sum of 2 martices a and b
    
            for(int i=0; i<2; i++){                        //for rows
                for(int j=0; j<3; j++){                    //for columns
                    c[i][j]= a[i][j] + b[i][j];            //implements the condition and stores in c matrix
                    System.out.print(c[i][j]+" ");         //printing the c matrix values
                }
                System.out.println();
            }  
    }
}
