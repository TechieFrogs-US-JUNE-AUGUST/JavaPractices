
public class String15 
{
    public static void main(String[] args) 
    {
        String str="rama krishna";
        System.out.println("Name is: " +str);
        String firstLetter= str.substring(0, 1);                    //this substring has first letter of string str
        String secondletter= str.substring(5, 6);                  //this substring has first letter of string str word krishna
        String remainingLetters= str.substring(1, 4 ); 
        String remainingLetters1= str.substring(6 , str.length());      //this substring contains remaining letters
        firstLetter= firstLetter.toUpperCase();                        //converts to uppercase
        secondletter= secondletter.toUpperCase();                     //converts to uppercase
        str= firstLetter+remainingLetters+secondletter+remainingLetters1;                     //after converting join the 2 substrings
        System.out.println("Name is: " +str);
        /*System.out.println(firstLetter);
        System.out.println(secondletter);
        System.out.println(remainingLetters);
        System.out.println(remainingLetters1);*/
    }
}