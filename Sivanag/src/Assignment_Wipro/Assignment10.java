package src.Assignment_Wipro;

public class Assignment10 {
    public static void main(String[] args) {
        System.out.print("Enter number of Lottery Tickets: ");
        int num=Assignment2.integerInput();
        System.out.println("Enter Tickets code");
        int tickets[]=new int[num];
        for(int i=0;i<num;i++)
        {
            tickets[i]=Assignment2.integerInput();
        }
        int cnt,cnt1=0,k1=0;
        for(int j=0;j<num;j++)
        {
            cnt=0;
            for(int k=j;k<num;k++)
            {
                if(tickets[j]==tickets[k])
                {
                    cnt++;
                }
            }
            if(cnt1<cnt)
            {
            cnt1=cnt;
            k1=j;
            }
        }
        System.out.println("Shortlisted Ticket is : " + tickets[k1]);
    }
    
}
