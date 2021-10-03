public class Pattern1aaaaa {
    public static void main(String[] args) {
        char ch = 'a';
        for( int i = 1; i <= 5 ; i++){ // for row
            for( int j = 1 ; j <= i ; j++){   // for the 1st string display
               System.out.print(i+ " ");
            }
            for( int k = i; k <= 5 ; k++){   //for the 2nd string display
                System.out.print(ch+ " ");
            }
            ch++;
            System.out.println();
        }
    }
}
