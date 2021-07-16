package Strings;

public class Assignment20 {
    public static void main(String[] args) {
        String st="What are you doing";
        System.out.println(st);
        if(st.indexOf("are")>-1)  
            System.out.println("are :" + "True");
            else
            System.out.println("are" + "False");
            if(st.indexOf("You")>-1)  
            System.out.println("You : " + "True");
            else
            System.out.println("You : " + "False");
            if(st.indexOf("you")>-1)  
            System.out.println("you : " + "True");
            else
            System.out.println("you : " + "False");
    }
    

    
}
