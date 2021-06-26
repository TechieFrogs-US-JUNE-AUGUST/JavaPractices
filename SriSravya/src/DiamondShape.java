public class DiamondShape {
    public static void main(String[] args) {
        int number = 7;
        int i, j;
        //outer loop1 for printing first half of diamond
        for (i = 1; i <=number; i++) {
            for (j = 1; j <= number - i; j++) {        //inner loop1 prints space
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {        //inner loop2 prints star
                System.out.print("*");
            }
            System.out.println("");
        }
            //Outer loop2 for printing second half of diamond
            for (i = number - 1; i > 0; i--) {
                for (j = 1; j <= number - i; j++) {     //inner loop1 prints space
                    System.out.print(" ");
                }
                for (j = 1; j <= i * 2 - 1; j++) {       //inner loop2 prints star
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
