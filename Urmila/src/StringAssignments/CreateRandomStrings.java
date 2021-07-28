package StringAssignments;

import java.util.Random;

public class CreateRandomStrings 
{
    public static void main(String[] args)
    {
        String s1 = "JavaProgram"; // create a string of all 
        StringBuilder s2 = new StringBuilder();// creating random string builder
        Random random = new Random(); //creating object for random 

        int lenght = 5; // Specifying lenght of the randomstring builder
        for(int i = 0; i< lenght; i++)//loop iterates characters in sentence and display them
        {
            int index = random.nextInt(s1.length());// generating random index number
            char randomChar = s1.charAt(index);//getting char specified by index from String
            s2.append(randomChar);//appending character to string builder
        }
            String randomString = s2.toString();
            System.out.println(" Random string is : " + randomString);
}

    }
