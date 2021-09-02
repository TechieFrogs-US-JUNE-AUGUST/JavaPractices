package Assignment;

import java.util.Calendar;

public class Assignment6 {
    public static void main(String[] args) {
        Calendar start=Calendar.getInstance();
        start.set(2020, 12, 01);
        Calendar end= Calendar.getInstance();
        end.set(2021, 01, 01);
        int numofDays=0;
        int friday=Calendar.FRIDAY;
        while(start.before(end))
        {
            if(start.get(Calendar.DAY_OF_WEEK)==friday)
            {
                numofDays++;
                start.add(Calendar.DATE, 7);
            }
            else
            {
                start.add(Calendar.DATE, 1);
            }
        }
        System.out.println(numofDays);

    }
    
}
