package Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int fArry[][] = {{1, 2, 3}, {2, 3, 4}, {4, 5, 6}};
        int sArry[][] = fArry.clone();
        System.out.println("original array elements:");
        for (int i = 0; i < fArry.length; i++) {
            for (int j = 0; j < fArry.length; j++) {
                System.out.print(fArry[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("copy of one array elements in to another array:");
        for (int i = 0; i < sArry.length; i++) {
            for (int j = 0; j < sArry.length; j++) {
                System.out.print(sArry[i][j] + " ");
            }
            System.out.println("");
        }
    }
}