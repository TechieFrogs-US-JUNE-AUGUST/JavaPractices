package Practice.Functional_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Day of the week
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
     InputStreamReader in = new InputStreamReader(System.in);
     BufferedReader bd = new BufferedReader(in);
     int day = Integer.parseInt(bd.readLine());
     String[] week={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
     
     if(day< 1 && day>7)
        {
            System.out.println("No such day of the week");
        }
        else
        System.out.println(week[day-1]);
        

    }
}