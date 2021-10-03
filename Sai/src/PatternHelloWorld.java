public class PatternHelloWorld {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "WORLD";
        for( int i = 0; i < 5 ; i++){ // for row
            for( int j = 0 ; j <= i ; j++){   // for the 1st string display
               System.out.print(s1.charAt(j)+ " ");
            }
            for( int k = i; k < 5 ; k++){   //for the 2nd string display
                System.out.print(s2.charAt(k)+ " ");
            }
            System.out.println();
        }
    }
}
