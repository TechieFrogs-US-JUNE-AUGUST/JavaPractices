public class String22 {
    public static void main(String[] args)
    {
        String str = "divya program";
        int c = 0;
        System.out.println("The entered string is: "+str);
        for(int i = 0; i < str.length(); i++)               //Count the characters in the string except space
        {
            if(str.charAt(i) != ' ')
                c++;
        }
        System.out.println("Total number of characters in the string: " + c);        //Displays the total number of characters in the string
    }
}

