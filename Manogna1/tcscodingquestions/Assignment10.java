package tcscodingquestions;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter Age");
       int age[]=new int[20];
         int fees=0;

     /* scannerObj.useDelimiter("/");
       while(true)
       {
        for(int i=0;i<age.length;i++)
        {
            age[i]=scannerObj.nextInt();
          
           
        }
        break;
    }*/
    for(int i=0;i<age.length;i++)
        {
            age[i]=scannerObj.nextInt();
            
        } 
       
        for(int i=0;i<age.length;i++)
        {
            if(age[i]==0 || age[i]>=120)
            {
                System.out.println("INVALID INPUT");
            }
            else if(age[i]<17)
            {
                fees=fees+200;
            }
            else if(age[i]>=17 && age[i]<40)
            {
                fees= fees+400;
            }
            else if (age[i]>=40)
            {
                fees=fees+300;
            }
           
        }
        System.out.println("Total Income " +fees + "INR");
        scannerObj.close();
       }     
    }
    

    
