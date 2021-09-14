public class PatternsP19 {
    public static void main(String[] args) {
        for(int i = 6 ; i >= 0 ; i--){
            int ch = 65;
            for(int k = 0 ; k < i ; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= 5 ; j++){
                System.out.print((char)(ch+j)+ " ");
            }
            System.out.println();
        }
    }
}
