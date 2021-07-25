
public class String18 
{
    public static void main(String[] args) 
    {
        String str= "rama krishna";
        System.out.println("Characters in string " +str+ " are: ");

        for(char ch: str.toCharArray())
         {                                                     //using for-each loop                          
            System.out.print(ch+ " , ");               
         }
    }
}