package strings;

import java.util.Random;

public class String10 
{
    public static void main(String[] args) 
    {
        String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//CREATED A STRING WITH ALL CHARACTERS
        StringBuilder sb= new StringBuilder(); // created Random StringBuilder
        Random random=new Random(); // Object of random Class
        int length =9; //Specify length of Random String
        for(int i=0;i<length;i++)
        {
            int index=random.nextInt(str.length()); //Random index number Generation
            char randomChar=str.charAt(index); //get character specified by indexfrom  str
            sb.append(randomChar);//Append character to StringBuilder
        }
        
        System.out.println("Random String is : " +sb.toString()); // o/p will be differnt every time u run the prog
    }
    
}
