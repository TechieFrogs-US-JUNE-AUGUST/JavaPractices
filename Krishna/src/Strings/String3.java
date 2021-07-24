package Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String3 
{
    public static void main(String[] args) throws ParseException 
    {
        String strDate="07/08/1997";
        Date date=new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        System.out.println(strDate  + "  " +date);        
    }
}