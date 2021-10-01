package src.Tcs_Assignment;

import java.util.Scanner;
public class Assignment1
{
public static void main(String[] args) {
    Scanner scanObject = new Scanner(System.in);
    //Enter Number of Candles Sold
    System.out.print("Enter of NUmber of Candles Sold : ");
    int numCandles=scanObject.nextInt();
    //Tnum is variable of Total number Candles in Jar
    int Tnum=10;
    //if condition to check number of Candles to sell is less than and minmum 1
    if(numCandles<=5 && numCandles>0)
    {
    System.out.println("Number of Candles Sold :" +numCandles);
    System.out.println("Number of Candles remaining : " +(Tnum-numCandles));
    }
    else{
        System.out.println("Invalid Input");
        System.out.println("Number of Candles Left : " +Tnum);
    }
    scanObject.close();
}

    
}