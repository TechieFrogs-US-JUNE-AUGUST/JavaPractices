package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog11 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year= scannerObj.nextInt();           //reading the i/p year from user
        boolean leap= false;                    //setting the leap to false initially

        if(year%4 == 0){                    //if year is divisble by 4 go to the inner if loop
            if(year%100 ==0){              //if the year is century then go to the inner inner if loop
                if(year%400 == 0)         //if the year is divided by 400 then it is a leap year
                leap= true;
                else
                leap= false;
               }
            else                        //if the year is not century
            leap= true;
            }
        else{                           //if the year is not divided by 4
           leap= false;
       }
        if(leap == true)
        System.out.println(year + " is a leap year");
        else 
        System.out.println(year + " is not a leap year");

       scannerObj.close();
    }
}
