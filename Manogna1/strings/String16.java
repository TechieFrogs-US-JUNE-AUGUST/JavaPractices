package strings;

public class String16 {//Convert every word to uppercase
    public static void main(String[] args) {
        String str="Strings Assignment";
        char charArray[]=str.toCharArray();//stores each char to chararray
        
        for(int i=0;i<charArray.length;i++)
        {
            if(Character.isLetter(charArray[i]))//if array element is a character
            {
                charArray[i]=Character.toUpperCase(charArray[i]);//change the char to uppercase
            }
        }
        str=String.valueOf(charArray);//convert char array to string
        System.out.println("String :" +str);
    }
    
}
