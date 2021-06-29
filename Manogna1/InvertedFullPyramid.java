public class InvertedFullPyramid {
    public static void main(String[] args) {
        int j;
        for (int i = 5; i >= 1; --i) {
            for (j = 1; j <= (5 - i) * 2; ++j) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" *");
            }
            for (int l = 1; l <=(i-1); l++) {

                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
