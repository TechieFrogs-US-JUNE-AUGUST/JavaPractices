public class PatternsP22 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5 ; i++){
            int ch = 65;
            
            for(int j = i; j <= 5; j++){
                System.out.print((char)(ch+j));
                
            }
            for(int k = 5-1 ; k >= i; k--){
                System.out.print((char)(ch+k));
            }
            System.out.println();
        }
    }
}
