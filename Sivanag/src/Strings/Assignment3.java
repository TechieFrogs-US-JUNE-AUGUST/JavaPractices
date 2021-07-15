package Strings;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Assignment3 {
    public static void main(String[] args)throws Exception {
        
    
    String date="28/04/2013";
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
    System.out.println(date1);
}
}
