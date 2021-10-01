package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter source bus stop");             //taking the i/p from user
        String s= scannerObj.nextLine();
        System.out.println("Enter destination bus stop");
        String d= scannerObj.nextLine();

        String busStops[]= {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};             //declaring the string busStops
        float path[]= {800, 600, 750, 900, 1400, 1200, 1100, 1500};                     //declaring the path(distance in mts)
        float fair= 0;
        int st= 0, ed= 0;                        //taking 2 counters for source and destination
        for(int i=0; i<8; i++){
           if(s.equals(busStops[i])){            //if source is equals to busstops then the index value of busStops is assigned to the source counter
               st= i;
           }
           if(d.equals(busStops[i])){           //if destination is equals to busstops then the index value of busStops is assigned to the destination counter
               ed= i;
           }
        }
        if(st == ed){                           //if source counter and destination counter values are equal then it gives invalid i/p
            System.out.println("INVALID INPUT");
        }
        else{                                 //if both source and destination are not equal then it calculates fair
            int i= st+1;
            while(i!= ed+1){
                fair= fair+path[i];
                i= (i+1) % 8;                   
            }
            fair= (float) (fair*0.005);          //	If d =1000 metres, then fare=5 INR, so 1m=0.005
            System.out.println(Math.ceil(fair)+ " INR");
        }
        scannerObj.close();
    }
}
