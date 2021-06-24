public class exer25 {
 
    public static void main(String[] args){
        int x = 6, y = 1;
        for(int i = 0; i < x; i++){
            for(int j = 1; j < x - i; ++j){
                System.out.print("");
            }
            for(int k = 0; k <=i; k++){
                if(k == 0 || i == 0)
                y = 1;
                else
                y = y * (i - k + 1) / k;
                System.out.printf("%4d", y);
            }
            System.out.println();
        }
    }
}