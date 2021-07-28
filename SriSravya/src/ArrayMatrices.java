//ADDITION OF 2 MATRICES
/* public class ArrayMatrices {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};                 //a and b matrices should be of equal size for addition
        int b[][]= {{5,6},{7,8}};

        int c[][]= new int[2][2];           //c matrix of 2 rows and 2 columns is used for storing the sum of 2 martices a and b

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j]= a[i][j]+ b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}        */


//SUBTRACTION OF 2 MATRICES
/* public class ArrayMatrices {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};                 //a and b matrices should be of equal size for subtraction
        int b[][]= {{5,6},{7,8}};

        int c[][]= new int[2][2];           //c matrix of 2 rows and 2 columns is used for storing the difference of 2 martices a and b

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j]= a[i][j] - b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    } 
}         */


//MULTIPLICATION OF 2 MATRICES
public class ArrayMatrices {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};
        int b[][]= {{5,6},{7,8}};

        int c[][]= new int[2][2];           //c matrix of 2 rows and 2 columns is used for storing the product of 2 martices a and b

        for(int i=0; i<2; i++){           //multiplying and printing multiplication of 2 matrices   
            for(int j=0; j<2; j++){
                c[i][j]= 0;             
           for(int k=0; k<2; k++){             //k loop is for, each row element of 1st matrix is multiplied by all columns in 2nd matrix
             c[i][j]= a[i][k] * b[j][k];
           }
           System.out.print(c[i][j]+" ");         //printing matrix element
        }
        System.out.println();
    }
  }
}           

 