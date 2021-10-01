public class PatternsP15 {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 5 ; i++){
            int ch = 65;
            for(int k = 0; k <= i; k++){
                System.out.print(" ");
            }
            for(int j = 5-i; j >= 0 ; j--){
                System.out.print((char)ch + " ");
                ch++;
            }
            
            System.out.println();
        }
    }
}
