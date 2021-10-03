public class PatternsP5 {
    public static void main(String[] args) {
        int lines = 6;
        //char ch = 'F';
        int n = 70;
        for( int i = 0; i < lines  ; i++){
            for( int j = i ; j < lines ; j++){
                System.out.print((char)(n-j)+" ");
            }
            //ch--;
            //ch = 'A';
            System.out.println();
        }
        char ch = 'A';
        for( int i = 0; i <= lines ; i++){
            for( int j = 0 ; j <= i ; j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
