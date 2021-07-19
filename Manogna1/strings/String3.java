package strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String3 {
    public static void main(String[] args) throws ParseException {
        String strDate="07/19/2021";
        Date date=new SimpleDateFormat("MM/dd/yyyy").parse(strDate);
        System.out.println(strDate  + "  " +date);
        
        
    }
    
}
