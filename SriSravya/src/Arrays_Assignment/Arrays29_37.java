//TO PRINT THE PRODUCT OF 2 MATRICES    
package Arrays_Assignment;

public class Arrays29_37 {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};
        int b[][]= {{5,6},{7,8}};

        int c[][]= new int[2][2];           //c matrix of 2 rows and 2 columns is used for storing the product of 2 martices a and b

        for(int i=0; i<2; i++){           //multiplying and printing multiplication of 2 matrices   
            for(int j=0; j<2; j++){
                c[i][j]= 0;             
           for(int k=0; k<2; k++){             //k loop is for, each row element of 1st matrix is multiplied by all columns in 2nd matrix
             c[i][j]= a[i][k] * b[j][k];       //implements the condition and stores in c matrix
           }
           System.out.print(c[i][j]+" ");         //printing matrix elements
        }
        System.out.println();
    }
    }
}
