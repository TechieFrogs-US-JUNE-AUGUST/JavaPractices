import java.util.Scanner;

public class Coding5 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int iPaint_sq = 18, ePaint_sq = 12;
        float cost  = 0, sqft;
        System.out.println("Give the number of interior walls to paint");
        int iWall = scannerObj.nextInt();  // 6 interior walls 
        System.out.println("Give the number of exterior walls to paint");
        int eWall = scannerObj.nextInt();  // 3 exterior walls
        if( iWall > 0 || eWall > 0){
            for(int i = 0; i < iWall; i++) {
                System.out.println("Give interior wall sqft");
                sqft = scannerObj.nextFloat();//getting interior walls sqfts 12.3, 15.2, 12.3, 15.2, 12.3, 15.2
                cost += iPaint_sq * sqft;   // getting the total cost of interior walls
            }
            for(int i = 0; i < eWall; i++) {
                System.out.println("Give exterior wall sqft");
                sqft = scannerObj.nextFloat();// getting the exterior walls sqtfs 10.10, 10.10, 10.00 
                cost += ePaint_sq * sqft;   // getting the total cost of exterior walls
            }
        }else if(iWall == 0 || eWall == 0){
            System.out.println("User may don't want to paint the wall");
        }else
            System.out.println("Invalid Input");
        System.out.println("Total estimated Cost : " + cost);
        scannerObj.close();
    }
}
