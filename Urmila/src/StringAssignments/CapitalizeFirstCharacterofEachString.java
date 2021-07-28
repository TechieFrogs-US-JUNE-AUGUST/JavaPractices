package StringAssignments;

public class CapitalizeFirstCharacterofEachString
{

    public static void main(String[] args)
    {
        String str = "this is java program";// create a string
        char[] charArray = str.toCharArray();// stores each characters to a char array
         boolean foundSpace = true;

         for(int i = 0; i < charArray.length; i++)
         {
             if(Character.isLetter(charArray[i]))// if the array element is a letter
             {
             if(foundSpace)// check space is present before the letter
              {
               charArray[i] = Character.toUpperCase(charArray[i]);// change the letter into uppercase
               foundSpace = false;
              }
          }
             else
              {
              foundSpace = true;// if the new character is not character
        }
    }    

              str = String.valueOf(charArray);
              System.out.println("After changing: " + str);
    }
}
