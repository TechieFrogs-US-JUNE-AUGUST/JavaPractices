public class Array33JaggedMulti {
    public static void main(String[] args){      
        int array1[][] = new int[2][]; 
        array1[0] = new int[3];  // First row has 3 columns
        array1[1] = new int[2];  // Second row has 2 columns
        int count1 = 0;
        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array1[i].length; j++)
                array1[i][j] = count1++;
        System.out.println("1st Jagged Array Matrix");
        display(array1);
        int array2[][] = new int[2][];
        array2[0] = new int[3];  // First row has 3 columns
        array2[1] = new int[2];  // Second row has 2 columns
        int count2 = 0;
            for (int i = 0; i < array2.length; i++)
                for (int j = 0; j < array2[i].length; j++)
                    array2[i][j] = count2++;
        System.out.println("2nd Jagged Array Matrix");
        display(array2);
        int jrow2 = array2.length;
        int jcolumn1 = array1[0].length;
        if(jrow2 != jcolumn1)
            System.out.println("Matrices cannot be multiplied");       
        else{  
            int production[][] = new int[array1.length][array2[0].length];      
            for(int i = 0; i < array1.length; i++){    
                for(int j = 0; j < array2[0].length; j++){    
                   for(int k = 0; k < array2.length; k++)
                      production[i][j] = production[i][j] + array1[i][k] * array2[k][j];        
                }    
            } 
            display(production);}
        }
        static void display(int displayMatrix[][]){  // method for displaying output
        for (int i = 0; i < displayMatrix.length; i++) {
            for (int j = 0; j < displayMatrix[i].length; j++)
                System.out.print(displayMatrix[i][j] + " ");
            System.out.println();
        }
    }
}