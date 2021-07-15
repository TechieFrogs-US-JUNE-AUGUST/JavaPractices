import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Astring3{  
public static void main(String[] args)throws Exception {  
    String sDate1="31/12/1998";  //date is given as string
    //SimpleDateFormat.parse(String) is used for string to date
    //SimpleDateFormat.parse(Date) is used for date to string
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); // string is converted to date format
    System.out.println(sDate1+"\t"+date1);  
}  
}  