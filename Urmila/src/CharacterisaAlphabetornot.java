public class CharacterisaAlphabetornot 
{

    public static void main(String[] args)
 {
    char s = '$'; 
    if(( s >= 'a' && s <= 'z') ||(s >= 'A' && s>= 'Z'))//compare s between 'a'to 'z'and 'A'to'B' ASIIvalue  
    System.out.println( s + "is alphabet"); //if s falls between ASIIvalue print s is alphabet
    else
    System.out.println(s  + "is  not alphabet"); //if not print s is not alphabet
 }
} 
/*
"char" is variable is stores the ASII value of a character
ASII value for lower case alphabet is 97 to 122
ASII value for upper case  alphabet is 65 to 90
*/