

import java.util.Scanner;

class Largestamong3numbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int x =sc.nextInt();
        System.out.print("Enter Second Number : ");
        int y =sc.nextInt();
        System.out.print("Enter Third Number : ");
        int z =sc.nextInt();
        //int x= 100;
        // int y=20;
        // int z=150;
     
        if(x > y)
            if(x>z)
             System.out.println("Largest among " + x +","+y+","+z + " is: " +x);
             else
             System.out.println("Largest among " + x +","+y+","+z + " is: " +z);
        else if(y>z)    
            System.out.println("Largest among " + x +","+y+","+z + " is: " +y); 
            else
            System.out.println("Largest among " + x +","+y+","+z + " is: " +z);
sc.close();
    }
}