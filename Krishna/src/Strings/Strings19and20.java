
public class Strings19and20
{                                                         
    public static void main(String[] args) 
    {
        String str="rama krishna";
        String str1="HI";
        str= str.toLowerCase();
        System.out.println("characters in first string are: " +str);
        str1= str1.toLowerCase();
        System.out.println("characters in second string are: " +str1);
        
        boolean result=str.contains(str1);                                   // check if str1 contents  present in the str or not.
        if(result)                                                           //  if result is true then it goes into the loop. or it goes to else statement.
        {
            System.out.println(str1 + " is Present in the first String");
        }
        else
        {
            System.out.println(str1 + " is not in the first String");
        }  

        int Result=str.indexOf(str1);                                      // checks if str1 is present in str using IndexOf

        System.out.println("Result :" +Result);                            //indexof(String ) is used to return the index of the String for first occurrence of passed substring as parameter from the sequence contained by this object. If substring str is not present then -1 is returned in place of index.

        if(Result==-1)
        {
            System.out.println(str1+ " is not in the String"); 
        }
        else
        {
            System.out.println(str1+ " is Present in the String");         
        } 
    }  
}