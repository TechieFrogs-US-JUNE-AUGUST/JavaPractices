package Arrays;

public class Arrays42 {
    public static void main(String[] args) {
            char[] ch = {'d', 'i', 'v', 'y', 'a'};            //declare and initialise the array variable
            String st = String.valueOf(ch);
            System.out.println("coversion of char to string: "+st);
             System.out.print("conversion of string to character:");
            for(int i=0; i<st.length();i++){                 // converting string to characters
                char c = st.charAt(i);
                System.out.print( c+" ,");
            }
    }
}
