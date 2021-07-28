//TO DETERMINE WHETHER TWO MATRICES ARE EQUAL
package Arrays_Assignment;

public class Arrays25 {
    public static void main(String[] args) {
        int a[][]= new int[][] {{1,2,3},{1,2,3}};             //initialisation
        int b[][]= new int[][] {{1,2,3},{4,5,6}};
        
        int count = 0;                                 //taking a variable as counter 
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                if(a[i][j]!= b[i][j]){               //checks the condition if both the matrices are equal or not
                    count = 1;                      //if condition is true the counter value is changed
                }
            }
        }
        if(count == 0)
           System.out.println("Both the matrices are Identical");
        else
           System.out.println("Bothe the matrices are not Identical");   
    }
}

