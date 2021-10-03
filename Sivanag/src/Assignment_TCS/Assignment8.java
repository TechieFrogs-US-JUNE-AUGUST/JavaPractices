

import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        String name =scannerObject.nextLine();
        char ch=scannerObject.nextLine().charAt(0);//it will take first character of string
        int amount=5000;
        if(ch=='Y' || ch=='y')
        {
            //Enter Children names separated by ,
            String cname=scannerObject.nextLine();
            //Split the given string to words with delimiter ,
            String[] cnames=cname.split(",");  
            //(cnames.length+1) is Total childrens and parent
            System.out.println("Total Members :" +(cnames.length+1));
            System.out.println("Commision Details");
            //cnames.length is total number of childrens
            System.out.println(cnames.length);
            //10% commision to Parent for each children
            System.out.println(name + " :" + (((amount*10)/100)*cnames.length) + " INR");
            for(int k=0;k<cnames.length;k++)
            {
                //5% commision to each Children
                System.out.println(cnames[k] + ": " + ((amount*5)/100) + " INR" );
            }
        }
        scannerObject.close();
    }
    
}
