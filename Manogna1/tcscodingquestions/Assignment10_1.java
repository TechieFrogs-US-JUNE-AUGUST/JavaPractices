package tcscodingquestions;

import java.util.Scanner;

public class Assignment10_1 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter age :");
        String age[]=new String[20];
        int fees=0;
       for(int i=0;i<age.length;i++)
        {
            age[i]=scannerObj.nextLine();
            if(age[i]=="\n")
            {
                break;
            }
           
        }
        
        scannerObj.close();
        for(int i=0;i<age.length;i++)
        {
            if(Integer.parseInt(age[i])==0 || Integer.parseInt(age[i])>=120)
            {
                System.out.println("INVALID INPUT");
            }
            else if(Integer.parseInt(age[i])<17)
            {
                fees=fees+200;
            }
            else if(Integer.parseInt(age[i])>=17 && Integer.parseInt(age[i])<40)
            {
                fees= fees+400;
            }
            else if (Integer.parseInt(age[i])>=40)
            {
                fees=fees+300;
            }
            System.out.println("Total Income " +fees + "INR");            
        }           
    }
    
}
