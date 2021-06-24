public class exer23 {// pyramid using numbers
    
    public static void main(String[] args){
        int a = 5, b = 0, x = 0, y = 0;
        for(int i = 1; i <= a; ++i){
            for (int j = 1; j <= a - i; ++j){
                System.out.print(" ");
                ++x;
            } 
            while(b != 2 * i -1){
                if(x <= a - 1){
                    System.out.print((i + b) + " ");
                    ++x;
                }
                else{
                    ++y;
                    System.out.print((i + b - 2 * y) + " ");
                }
                ++b;
            }
            y = x = b = 0;
            System.out.println();
        }
    }
}