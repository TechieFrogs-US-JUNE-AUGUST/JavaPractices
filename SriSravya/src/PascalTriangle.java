public class PascalTriangle {
    public static void main(String[] args) {
        int i, j, k;
        int x = 0;
        for (i = 0; i < 6; i++) {
            for (j = 1; j <= 6-i; j++) {
                System.out.print(" ");    //Prints Space
            }
            for (k = 0; k <= i; k++) {
                if (k == 0 || i == 0)
                    x = 1;
                else
                    x = x * (i - k + 1) / k;
                System.out.print(" " + x);
            }
            System.out.println();

        }
    }
}
