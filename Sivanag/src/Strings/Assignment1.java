//Count the Total Number of Vowels,Digits,Spaces,Consonants
package Strings;
import java.util.Scanner;
public class Assignment1
{
    Boolean IsAlphabet(char ch)                                                        //Method to check character is Alphabet or Not 
    {
       if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
           return true;
        else
           return false;
    }
  
    public static void main(String[] args) {
                    Scanner scannerObject = new Scanner(System.in);
                    System.out.println("Enter the Sentence: ");
                    String s=scannerObject.nextLine();
                     //String s= "This is sivanag 1223588";
                     System.out.println(s.length());
                     //System.out.println(s.charAt(2));
                     int num=0;
                     int sp=0;
                     int v=0;
                     int cons=0;
                     Assignment1 obja=new Assignment1();
                     for(int i=0;i<s.length();i++)
                     {
                        if(Character.isDigit(s.charAt(i)))                              //if condition to check character is digits or not
                        num++;
                        if(Character.isWhitespace(s.charAt(i)))                         //if condition to check character is space or not
                        sp++;
                        if(obja.IsAlphabet(s.charAt(i)))                                //Alphaber check
                        {
                        switch(s.charAt(i))                                             //switch to check character is Vowel or consonants
                        {
                            case 'a','e','i','o','u','A','E','I','O','U' : v++;         
                                                                            break;
                            default : cons++;
                            break;

                        }
                    }
                        
                     }
                     System.out.println("Total Number of Digits in Given Sentence is : " + num);
                     System.out.println("Total Number of Spaces in Given Sentence is : " + sp);
                     System.out.println("Total Number of Vowels in Given Sentence is : " + v);
                     System.out.println("Total Number of Consonants in Given Sentence is : " + cons);
                     scannerObject.close();
    }

    


}