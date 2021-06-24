public class exer22 {//full pyramid using star
    
    public static void main(String[] args){
        int a = 5, b = 0;
        for(int i = 1; i <= a; ++i, b = 0){
            for(int j = 1; j <= a - i; ++j){
                System.out.print(" ");
            }
            while(b !=2 * i - 1){
                System.out.print(" * ");
                ++b;
            }
            System.out.println();
        }
    }
}