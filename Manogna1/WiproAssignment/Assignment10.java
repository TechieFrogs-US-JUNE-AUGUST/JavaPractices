package WiproAssignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter number of lottery tickets");
        int num=scannerObj.nextInt();
        System.out.println("Enter Code for Tickets");
        int tickets[]=new int[num];
        for(int i=0;i<num;i++)
        {
            tickets[i]=scannerObj.nextInt();
        }
        scannerObj.close();
        int count,count1=0,k=0;
        for(int i=0;i<num;i++)
        {
            count=0;
            for(int j=i;j<num;j++)
            {
                if(tickets[i]==tickets[j])
                {
                    count++;
                }
            }
            if(count1<count)
            {
                count1=count;
                k=i;
            }
        }
        System.out.println("Shortlisted Ticket is : " +tickets[k]);
    }
    
}
