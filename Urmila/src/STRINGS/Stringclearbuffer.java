package strings;

public class Stringclearbuffer 
{
    public static void main(String[]args)
    {
     StringBuffer str = new StringBuffer();// creating a string buffer
     str.append("my");                    //add string to string buffer
     str.append("favourite");
     str.append("game is");
     str.append(" Chess");
     System.out.println("StingBuffer:"+ str);

     str.delete(0,str.length());                   
     System.out.println("Updated StringBuffer:"+ str);
     
    }

   
}
