package strings;

public class String40 {
    public static void main(String[] args) {
        String str="doing Program 40 in strings Assignment";
        String word=" ";
        String small=" ",large=" ";
        String words[]=new String[100];
        int length=0;
        str=str+" ";//add extra space to the string to get the last word
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                word=word+str.charAt(i);//split string into words
            }
            else
            {
                words[length]=word; //add word to array of words
                length++; //incremnt length
                word=" ";// empty the string
            }
        }
        small=large=words[0];//Initialize small and large with first word of string

        for(int k=0;k<length;k++)//determines the smallest and largest word in the string
        {
            if(small.length()>words[k].length())//if length of small is greater than any word present in the string
            small=words[k]; //store that word into small
            if(large.length()<words[k].length())//if length of large is smaller than any word present in the string
            large=words[k]; //store that value to large
        }
        System.out.println("Smallest Word : " +small);
        System.out.println("Largest Word :" +large);
    }
    
}
