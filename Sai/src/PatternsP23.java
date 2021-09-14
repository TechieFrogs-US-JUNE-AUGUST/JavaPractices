public class PatternsP23 {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 6 ; i++){
            int ch = 65;
            for(int k = 0; k <= 6-i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++){
                System.out.print((char)(ch+i)+ " ");
            }
            System.out.println();
        }
    }
}
