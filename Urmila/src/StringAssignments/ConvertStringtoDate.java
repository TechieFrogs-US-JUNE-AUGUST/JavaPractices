package StringAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;
public class ConvertStringtoDate
{  
public static void main(String[] args)throws Exception 
{  
    String sDate1="07/09/1996";  //SimpleDateFormat.parse(String) is used for string to date

    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); // string is converted to date format
    System.out.println(sDate1+"\t"+date1); 
}
}
