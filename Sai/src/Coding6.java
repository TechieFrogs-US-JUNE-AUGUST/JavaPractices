import java.util.Scanner;

public class Coding6 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the Destination : ");
        String departure = scannerObj.next();
        System.out.print("Enter the Arrival : ");
        String arrival = scannerObj.next();
        int busStops = 8;
        String busStopsArray[] =new String[]{"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        int path[] = new int[]{800, 600, 750, 900, 1400, 1200, 1100, 1500};
        int start = 0;
        float distance = 0;
        for(int i=0;i<8;i++){
            if(busStopsArray[i].equals(departure)){
                start=i;
                break;
            }
        }
        for(int j=start+1;j<=busStops;j++){
            if(busStopsArray[start].equals(arrival)){
                System.out.println("Invalid Input");
                break;
            }
            else{
                j=j%8; //after 8 it will check for 1
                distance =(float)(distance+(path[j]*0.005));//100m=5inr so 1m=0.005
                if(busStopsArray[j].equals(arrival)){
                   
                    System.out.println(Math.ceil(distance) +"INR");
                    break;
                }
            }
        }
        scannerObj.close(); 
        /*for(int i = 0; i < busStops; i++){  //i = count for stops
            if(departure.equals(busStopsArray[i])){ 
                start = i; 
            }
            if(arrival.equals(busStopsArray[i])){  
                end = i;
            }
        }
        if(start == end){
            System.out.println("Invalid Input");
        }else{
            int i = start + 1;
            while(i != end+1){
                distance += path[i];
                i = (i+1)%8;
            }
            System.out.println(Math.ceil(distance/200) + " INR");
            // Math.ceil(number) gives the closest double value of the given number                                                    
        }*/
        //scannerObj.close();
    }
}