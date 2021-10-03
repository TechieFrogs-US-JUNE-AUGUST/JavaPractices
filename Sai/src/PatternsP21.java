public class PatternsP21 {
    public static void main(String[] args) {
        for(int i= 0; i <= 5; i++){
            int ch = 65;
            for(int j = 0 ; j < 5-i ; j++){
                System.out.print((char)ch);
            }
        for (int k = 5 ; k >= 5-i; k--){
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
}
