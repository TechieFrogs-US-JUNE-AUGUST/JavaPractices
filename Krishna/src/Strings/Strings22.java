
public class Strings22 
{
    public static void main(String[] args) 
    {
        String str="rama krishna";
        int count=0;                                                                         // count is used to store no of characters in string
        for(int i=0;i<str.length();i++)
            {
                 if(str.charAt(i)!=' ')                                                      //Counts each character except space
                 count++;
            }

        System.out.println("Total Number of Characters :" +count);                         //Display total number of Characters        
    }
} 