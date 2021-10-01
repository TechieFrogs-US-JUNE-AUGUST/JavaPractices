package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        int n= scannerObj.nextInt();          //n is total num of monkeys
        int k= scannerObj.nextInt();          //k is num of bananas eatable by each monkey
        int j= scannerObj.nextInt();          //j is num of peanuts eatable by each monkey
        int m= scannerObj.nextInt();          //m is total num of bananas
        int p= scannerObj.nextInt();          //p is total num of peanuts
        int ateBanana=0, atePeanut=0;
        if(n<0 || k<0 || j<0 || m<0 || p<0){
            System.out.println("INVALID INPUT");
        }
        else{ 
            if(k>0)                         //if num of bananas eatable by single monkey is >0
            ateBanana= m/k;                //then ateBanana is calulated dividing by 'total num of bananas with num of bananas eatable by single monkey'

            if(j>0)                        //if num of bananas eatable by single monkey is >0
            atePeanut= p/j;               //then atePeanet is calulated dividing by 'total num of peanuts with num of peanuts eatable by single monkey'

            n= n-ateBanana-atePeanut;     //total num of monkeys left is calculated here               
            System.out.println("Number of Monkeys left on the tree: " +n);
        }
        scannerObj.close();
    }
}
