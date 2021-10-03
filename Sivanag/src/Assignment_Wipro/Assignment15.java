import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter String: ");
        String string =scannerObj.nextLine();
        String[] strings=string.split(" ");
        int cnt1=0;
        for(int i=0;i<strings.length;i++)
        {
            int cnt=0;
            if(!strings[i].equals("0"))
            {
            for(int j=i+1;j<strings.length;j++)
            {
                if(strings[i].equals(strings[j]))
                {
                    cnt++;
                    strings[j]="0";
                }
                
            }
            if(cnt==0)
            {
                System.out.print(strings[i] + " ");
                cnt1++;
            }
            
            }
        }
        System.out.println();
        System.out.println("Count the unique words in the sentence are :" +cnt1);
        scannerObj.close();
    }   
}
