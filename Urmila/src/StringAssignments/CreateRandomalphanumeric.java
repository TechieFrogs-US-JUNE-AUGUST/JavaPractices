package StringAssignments;
import java.util.Random;
public class CreateRandomalphanumeric
{
    public static void main(String[] args)
    {
     String s1 = "THISISJAVAPROGRAM";//creating string for uppercase characters
     String s2= "thisisjvaprogram";// creating string for lowercase characters
     String s3 = "0123456789";            // creating string for numbers
     
     String Alphanumeric = s1 + s2 + s3 ;//combing all above strings
     StringBuilder str = new StringBuilder();// creating random String builder
     Random random = new Random(); // generating random index number
     int lenght = 4; // specifying lenght of random string

     for (int i = 0; i < lenght; i++)//loop iterates characters in sentence and display them
     {
        int index = random.nextInt(s1.length());// generating random index number
        char randomChar = Alphanumeric.charAt(index);// getting char specified by index from the string
        str.append(randomChar);// append the character to stringbuilder  
     }
        String randomString = str.toString();
        System.out.println("Random String is : " + randomString);
    }   
}