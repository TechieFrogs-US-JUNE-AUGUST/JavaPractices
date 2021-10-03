public class PatternsP8 {
    public static void main(String[] args) {
        
        for(int i = 0; i <= 6; i++){  // 6 is because F is 6th character of alphabets
            int ch = 70;  // 70 is ASCII value of Character F
            for(int j = i ; j > 0 ; j--){
                System.out.print((char)ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
