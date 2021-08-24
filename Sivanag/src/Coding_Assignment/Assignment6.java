package src.Coding_Assignment;
import java.util.Calendar;
import java.util.Scanner;
public class Assignment6 {
        static void dayss(String start,String end)
        {
            String[] s=start.split("/");
            String[] e=end.split("/");
            if(s.length==3 && e.length==3)
            {
            Calendar startDay=Calendar.getInstance();
            startDay.set(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0]));
            Calendar endDay =Calendar.getInstance();
            endDay.set(Integer.parseInt(e[2]), Integer.parseInt(e[1]), Integer.parseInt(e[0]));
            int cntFridays=0;
            int cntWeekDays=0;
            while(startDay.before(endDay))
            {

                if(startDay.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY)
                {
                    cntFridays++;
                    cntWeekDays++;
                    startDay.add(Calendar.DATE, 1);
                }
                else
                {
                    System.out.println(startDay.get(Calendar.DAY_OF_WEEK));
                if((startDay.get(Calendar.DAY_OF_WEEK)!=Calendar.SATURDAY) && (startDay.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY))
                {
                    cntWeekDays++;
                    startDay.add(Calendar.DATE, 1);
                }else
                startDay.add(Calendar.DATE, 1);
                }
            }
            System.out.println("Number of Fridays is : " + cntFridays);
            System.out.println("Number of WeekDays is : " + cntWeekDays);
        }
        }    
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter Starting Date : ");
        String sDate=scannerObj.nextLine();
        System.out.print("Enter Ending Date : ");
        String sDate1=scannerObj.nextLine();
        dayss(sDate, sDate1);
        scannerObj.close();
    }       
}
