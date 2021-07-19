package strings;
import java.util.Scanner;
import java.util.Scanner.nextline();
public class String37Duplicatecharacters 
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter sentence");
        int string = scannerObj.nextLine(); 
        System.out.println("Duplicates in- "+ string);
        int count;
        for(int i = 0; i < string.length(); i++)
         {
          count=1;
          String ch = string.charAt(i);//to check every character
            if(ch == ' ')              // it checks any spaces 
            continue;
            for(int j = i + 1; j < string.length(); j++)
             {
              if(ch == string.charAt(j))
              {
                count++;              // remove the char 
                string = string.substring(0) + string.substring(j+ 1);
              }
        }
        if(count > 1) {
           System.out.println(ch+ " found " + count + " times");
        }
        }scannerObj.close();

    
}
