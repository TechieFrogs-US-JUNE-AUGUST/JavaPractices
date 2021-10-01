package tcscodingquestions;

import java.util.Scanner;

public class Assignment10_2 {
    static int ageCheck(int age)
    {
        int fee=0;
        if(age<17 && age > 0)
         fee=200;
        else
        if(age<=40 && age >= 17)
            fee=400;
        else if(age>40 && age < 120)
            fee=300;
            return fee;
    }
    static boolean intCheck(String st)
    {
        for(int i=0;i<st.length();i++)
        {
           if(!Character.isDigit(st.charAt(i)))
           {
            return false;
           }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter Age ");
        int age=0;
        int sum=0;
     ff:   for(int i=0;i<20;i++)
        {
        do{    
            String s=scannerObject.nextLine();
        
              if(s.isEmpty())   
                {
                    
                break ff;
                }
                else
                {
                    if(intCheck(s))
                    {
                    age=Integer.parseInt(s);
                    sum=sum+ageCheck(age);
                    }else
                    System.out.println("Enter Numbers between 1 to 120");
                }           
        }while(age < 1 || age >120 );
        //sum=sum+ageCheck(checkInput());
    }
           System.out.println("Total Amount is : Rs " +sum);;


        scannerObject.close();
    }
    
}

    

