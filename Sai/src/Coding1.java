import java.util.Scanner;
public class Coding1 {
    public static void main(String[] args) {
        int N = 10, K, M; 
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Number od candies you want to buy ? - ");
        int buy = scannerObj.nextInt();//give input 3 for getting 3 candies and 0 for not buying
        scannerObj.close();
        M = N - buy; // number of candies left after selling
        K = N - M; // number of candies sold
        if(buy <= 0 && K < 5){
                System.out.println("Invalid Input");
                System.out.println("Number of Candies Left : "+ M);
        }
        else{
                System.out.println("Number of Candies Sold : " + K);
                System.out.println("Number of Candies Available : "+ M);
                for(K = 5 ; K < N; K++){ }//refilling the jar with candies until it reaches the N value
                System.out.println("The jar is refilled again to total of : " +K);
        }
        //scannerObj.close();
    }
}
