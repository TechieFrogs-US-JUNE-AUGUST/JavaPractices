package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog5 {
   public static void main(String[] args) {
    int ni, ne;
    float intP= 18, extP= 12, cost=0, temp;            //intP is interior wall painting cost and extP is exterior wall painting cost
    Scanner scannerObj= new Scanner(System.in);
    System.out.println("Enter number of Interior walls");
    ni= scannerObj.nextInt();                        //ni is num of interior walls and those are readed by the user
    System.out.println("Enter number of Exterior walls");
    ne= scannerObj.nextInt();                       //ne is num of exterior walls 

    if(ni<0 || ne<0){
        System.out.println("INVALID INPUT");
    }
    else if(ni==0 && ne==0){
        System.out.println("Total Estimated cost: 0.0");
    }
    else{
        for(int i=0; i<ni; i++){                //for loop for calculating the surface area of Interior walls in square feet
            temp= scannerObj.nextFloat();
            cost= cost+intP*temp;
        }
        for(int i=0; i<ne; i++){              //for loop for calculating the surface area of Exterior walls in square feet
            temp= scannerObj.nextFloat();
            cost= cost+extP*temp;
        }
        System.out.println("Total Estmated Cost is: " +cost);
    }
    scannerObj.close();
   } 
}
