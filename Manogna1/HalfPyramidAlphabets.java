public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        char a='A';
        char b='E';
        for(int i=1;i<=('E'-'A'+1);++i){
            for(int j=1;j<=i;++j){
                System.out.print(a+ " ");
            }
            ++a;
            System.out.println( );
        }
    }
}
