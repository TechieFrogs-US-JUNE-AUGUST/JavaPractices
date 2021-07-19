package strings;
public class StringBufferSetlenght
{
    public static void main(String[]args)
    {
     StringBuffer str = new StringBuffer();// creating a string buffer
     str.append("java");                   //add string to string buffer
     str.append("is");
     str.append("programming");
     str.append("language");
     System.out.println("StingBuffer:"+ str);

     str.setLength(0);                    //clear the string using setlenght()
     System.out.println("Updated StringBuffer:"+ str);
    }
}

