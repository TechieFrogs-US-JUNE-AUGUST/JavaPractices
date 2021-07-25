package Practice;

public class ArrayClone {
    static void displayArray(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");

        }
        System.out.println();
    }
    static void displayArray(int[][] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        
    }
        public static void main(String[] args) {
        int[] array2 ={10,50,20,30,40};
        int[] arrayCopy=array2.clone();
        arrayCopy[1]=90;
       
        System.out.println("Original Array");
        displayArray(array2);
        System.out.println("Clone Array");
        displayArray(arrayCopy);
        int[][] multiArray = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] multiArray1 = multiArray.clone();
        multiArray[1][1]=10;
        System.out.println("Original MultiArray");
        displayArray(multiArray);
        System.out.println("Clone MultiArray");
        displayArray(multiArray1);
    }
}
