import java.util.Scanner;

public class Coding7 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print(" Total number of Monkeys : ");
        int n = scannerObj.nextInt();
        System.out.print("Every monkey can eat number of Bananas : ");
        int k = scannerObj.nextInt();
        System.out.print("Every monkey can eat number of Peanuts : ");
        int j = scannerObj.nextInt();
        System.out.print("Total number of Bananas : ");
        int m = scannerObj.nextInt();
        System.out.print("Total number of Peanuts : ");
        int p = scannerObj.nextInt();
        int bM = 0 , pM = 0;
        if(n > 0){
            if(k > 0 || j > 0){
                bM = m/k; //number of monkeys ate bananas
                pM = p/j;

            }
            System.out.println("Total number of monkeys left on the Tree: "+ (n-bM-pM));
        }else{
            System.out.println("Invalid Input");
        }
        scannerObj.close();
    }
}
