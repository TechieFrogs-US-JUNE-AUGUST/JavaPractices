public class Array32JaddedAdd {
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
        int addJaggedArray[][] = new int[3][2];//array for addition
        for(int row = 0; row < 3; row++){ //loop for to do adding both arrays
           for(int column = 0; column < 2 ; column++){
               addJaggedArray[row][column] = array1[row][column] + array2[row][column];
           }
        }
        display(addJaggedArray);
    }
        static void display(int displayMatrix[][]){  // method for displaying output
        for (int i = 0; i < displayMatrix.length; i++) {
            for (int j = 0; j < displayMatrix[i].length; j++)
                System.out.print(displayMatrix[i][j] + " ");
            System.out.println();
        }  // incomplete, can not finish this. not getting output
    }
}
