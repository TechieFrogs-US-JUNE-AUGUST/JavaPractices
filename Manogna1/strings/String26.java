package strings;

public class String26 {
    public static void main(String[] args) {
        String str="aaaabbbbcccc";
        int length=str.length(); //Stores the length of the String
        int num=3,temp=0;
        int chars=length/num; 
        String str1[]= new String[num]; //Stores Array of string
        System.out.println("Length " +length);
        if(length%num!=0) //Check whether it is divided into n equal Parts
        {
            System.out.println("Sorry this string cannot be divided into " +num + "equal parts :");
        }
        else
        {
            for(int i=0;i<length;i=i+chars)
            {
            String part=str.substring(i, i+chars); //Dividing string into 'num' equal parts using substring
            str1[temp]=part;
            temp++;
            } 
            System.out.println(num+ "Equal parts of given Stringf :");   
            for(int i=0;i<str.length();i++)
            {
                System.out.println(str1[i]);
            }
        }
    }
    
}
