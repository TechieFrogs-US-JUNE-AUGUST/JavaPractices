public class PatternsP17 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 5 ; i++){
            int ch = 65;
            for(int k = 1; k <= i ; k++){
                System.out.print(" ");
            }
            for(int j = 5-i; j >= 0 ; j--){
                System.out.print((char)(ch+i));
                ch++;
            }
            System.out.println();
        }
        for(int i = 6 ; i >= 0 ; i--){
            int ch = 65;
            for(int k = 0 ; k < i ; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= 5 ; j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
