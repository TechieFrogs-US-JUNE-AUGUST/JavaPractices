import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//string to int

/*  public class TypeConversions {
    public static void main(String[] args) {
       String s= "20";
       int i=Integer.parseInt(s);    //converting string to int using Integer.parseInt()
       System.out.println(i);
    }
}        */


//int to string

/* public class TypeConversions{
    public static void main(String[] args) {
        int i=20;
        String s= String.valueOf(i);    //converting int to string using String.valueOf() or Integer.toString()
        System.out.println(s);
        System.out.println(i + 100);   //here + is binary operator
        System.out.println(s + 100);   //here + is concatenation opertor
    }
}          */

//string to float

/* public class TypeConversions{
    public static void main(String[] args) {
        String s= "20";
        float f= Float.parseFloat(s);        //converting string to float using Float.parseFloat()
        System.out.println(f);
    }
}             */


//float to string

/*  public class TypeConversions{
    public static void main(String[] args) {
        float f= 20f;
        String s= String.valueOf(f);       //converting float to string using String.valueOf() or Float.toString()
      //String s= Float.toString(f);
        System.out.println(s+10);
    }
}        */


//string to double

/* public class TypeConversions{
    public static void main(String[] args) {
        String s= "20";
        double d= Double.parseDouble(s);             //converting string to double using Double.parseDouble()
        System.out.println(d);
    }
}           */


//double to string

/*  public class TypeConversions{
    public static void main(String[] args) {
        double d= 20.0;
        //String s= String.valueOf(d);       
        String s= Double.toString(d);          //converting double to string using String.valueOf() and Double.toString()
        System.out.println(s+10);
    }
}         */


//string to date 

/* public class TypeConversions{
    public static void main(String[] args) throws ParseException {
        String s= "21/05/1998";
        Date dateObj= new SimpleDateFormat("dd/mm/yyyy").parse(s);        //instance  with parse() method of DateFormat and SimpleDateFormat classes
        System.out.println(s + "\t" + dateObj);
    }
}           */


//date to string

/* public class TypeConversions{
    public static void main(String[] args) {
        Date dateobj= Calendar.getInstance().getTime();                   //getting date and time internally by compiler using bulitin functions
        DateFormat dateFormatObj= new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");       //instance for dateFormat class
        String s= dateFormatObj.format(dateobj);                           //using format() method of java.text.DateFormat.class
        System.out.println("Converted String is: " +s);
    }
}                */


//string to char

/* public class TypeConversions{
    public static void main(String[] args) {
       String s= "Sri";
       char ch= s.charAt(0);                      //converting string to char using charAt()
       System.out.println(ch);
    }
}              */


//char to String

/* public class TypeConversions{
    public static void main(String[] args) {
        char ch= 'V';
        //String s= String.valueOf(ch);
        String s= Character.toString(ch);             //converting char to string using String.valueOf() and Character.toString
        System.out.println("String is: " +s);
    }
}          */


//String to Object

public class TypeConversions{
    public static void main(String[] args) {
        String s= "Sri";
        Object obj= s;                  //converting string to Object with assignment operator i.e, here assigning string to Object
        System.out.println(obj);
    }
}
 

